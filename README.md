bus-routes
==========

Search for bus routes between stops

Running the application
-----------------------

Run the following command to import data from JSON file:

    java -jar target/bus-routes-1.0-SNAPSHOT.jar import src/main/resources/config.yml

Run the following command to start the server:

    java -jar target/bus-routes-1.0-SNAPSHOT.jar server src/main/resources/config.yml

Try the following queries:

    curl "http://127.0.0.1:8080/stop/search?name=aldate's"
    curl "http://127.0.0.1:8080/route/search?start=69323797&end=69326475"

Strategies
----------

* One node per bus stop, relations are "route", properties on route define the name of routes available on the "segment"
* One node per bus stop per route, relations define one route

Model
------

* Node for a stop on a route
* Node to represent one stop on a route (hub?)
* Node to represent a "hub" (a group of stops)
* Relation to define a (bus) "route"
* Relation to define path between "stops" in a "hub"
