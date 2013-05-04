import logging
import json

from lxml import etree

import re
from unicodedata import normalize


# Maps operator encoded names to known "friendly versions"
OPERATOR_NAMES = {'SOX': 'Stagecoach',
        'TT': 'Thames Travel',
        'OBC': 'Oxford Bus Company',
        '*Voyager_PD_RAV(en-GB)*': 'ARRIVA',
        }

_punct_re = re.compile(r'[\t !"#$%&\'()*\-/<=>?@\[\\\]^_`{|},.]+')


def slugify(text, delim=u'-'):
    """Generates an slightly worse ASCII-only slug.
    See http://flask.pocoo.org/snippets/5/"""
    result = []
    for word in _punct_re.split(text.lower()):
        result.append(word)
    return unicode(delim.join(result))


class CloudAmberBusRouteProvider(object):
    
    def __init__(self, url):
        self.url = url
        self.routes = []
        self.stops = []

    def parse(self):
        self._scrape_search_page()
        return {'routes': self.routes, 'stops': self.stops}

    def _scrape_search_page(self):
        logging.info("Scraping main page")
        e = etree.parse(self.url, parser=etree.HTMLParser())
        logging.info("Parsing main page")
        rows = e.findall('.//div[@class="cloud-amber"]')[0].findall('.//table')[1].findall('tbody/tr')
        for row in rows:
            route_no, operator, dest = row.getchildren()
            route_no = route_no.text
            if operator:
                operator = operator.find('span').text
                operator = OPERATOR_NAMES.get(operator, operator)
            else:
                operator = "None"
            route = dest.find('a').text
            route_href = dest.find('a').get('href')

            route_id = "{operator}:{no}:{name}".format(operator=slugify(operator),
                                                        no=route_no,
                                                        name=slugify(route))
            logging.info("Found route {id}".format(id=route_id))
            self.routes.append({'id': route_no, 'operator': operator, 'name': route, 'slug': route_id})
            self._scrape_route(route_id, route_href)

    def _scrape_route(self, route_id, href):
            """Load route data from our Cloudamber provider and capture the stop data."""
            logging.info("Scraping route: %s" % href)
            e = etree.parse(href, parser=etree.HTMLParser())
            rows = e.findall('.//div[@class="cloud-amber"]')[0].findall('.//table')[1].findall('tbody/tr')
            stops = []
            for i, row in enumerate(rows):
                expand, naptan, map_href, stop_name, town = row.getchildren()
                stop_code = naptan.text
                stop_name = stop_name.find('a').text
                logging.debug('Getting stop ID %s' % stop_code)
                stops.append({'code': stop_code, 'name': stop_name, 'order': i})
            self.stops.append({'stops': stops, 'route': route_id})


in __name__ == '__main__':
    provider = CloudAmberBusRouteProvider(oxon_url)

    data = provider.parse()

    with open('data.json', 'w') as out:
        json.dump(data, out)
