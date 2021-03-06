//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.org.naptan package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VersionedObjectTimestamped_QNAME = new QName("http://www.naptan.org.uk/", "VersionedObjectTimestamped");
    private final static QName _StopPoint_QNAME = new QName("http://www.naptan.org.uk/", "StopPoint");
    private final static QName _Contributor_QNAME = new QName("http://www.naptan.org.uk/", "Contributor");
    private final static QName _LocationSystem_QNAME = new QName("http://www.naptan.org.uk/", "LocationSystem");
    private final static QName _ValidityPeriod_QNAME = new QName("http://www.naptan.org.uk/", "ValidityPeriod");
    private final static QName _StopArea_QNAME = new QName("http://www.naptan.org.uk/", "StopArea");
    private final static QName _Descriptor_QNAME = new QName("http://www.naptan.org.uk/", "Descriptor");
    private final static QName _StopValidity_QNAME = new QName("http://www.naptan.org.uk/", "StopValidity");
    private final static QName _AnnotatedCrossRef_QNAME = new QName("http://www.naptan.org.uk/", "AnnotatedCrossRef");
    private final static QName _Extensions_QNAME = new QName("http://www.naptan.org.uk/", "Extensions");
    private final static QName _VersionedChild_QNAME = new QName("http://www.naptan.org.uk/", "VersionedChild");
    private final static QName _VersionedObject_QNAME = new QName("http://www.naptan.org.uk/", "VersionedObject");
    private final static QName _DataRight_QNAME = new QName("http://www.naptan.org.uk/", "DataRight");
    private final static QName _Organisation_QNAME = new QName("http://www.naptan.org.uk/", "Organisation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.org.naptan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContributorsStructure }
     * 
     */
    public ContributorsStructure createContributorsStructure() {
        return new ContributorsStructure();
    }

    /**
     * Create an instance of {@link StopArea }
     * 
     */
    public StopArea createStopArea() {
        return new StopArea();
    }

    /**
     * Create an instance of {@link StopPointStructure.Place.Location }
     * 
     */
    public StopPointStructure.Place.Location createStopPointStructurePlaceLocation() {
        return new StopPointStructure.Place.Location();
    }

    /**
     * Create an instance of {@link StopPointStructure.Place }
     * 
     */
    public StopPointStructure.Place createStopPointStructurePlace() {
        return new StopPointStructure.Place();
    }

    /**
     * Create an instance of {@link HalfOpenDateRangeStructure }
     * 
     */
    public HalfOpenDateRangeStructure createHalfOpenDateRangeStructure() {
        return new HalfOpenDateRangeStructure();
    }

    /**
     * Create an instance of {@link Contributor }
     * 
     */
    public Contributor createContributor() {
        return new Contributor();
    }

    /**
     * Create an instance of {@link AnnotatedStopPointRefStructure }
     * 
     */
    public AnnotatedStopPointRefStructure createAnnotatedStopPointRefStructure() {
        return new AnnotatedStopPointRefStructure();
    }

    /**
     * Create an instance of {@link NptgLocalityRefsStructure }
     * 
     */
    public NptgLocalityRefsStructure createNptgLocalityRefsStructure() {
        return new NptgLocalityRefsStructure();
    }

    /**
     * Create an instance of {@link AnnotatedRailRefStructure }
     * 
     */
    public AnnotatedRailRefStructure createAnnotatedRailRefStructure() {
        return new AnnotatedRailRefStructure();
    }

    /**
     * Create an instance of {@link NaturalLanguageStringStructure }
     * 
     */
    public NaturalLanguageStringStructure createNaturalLanguageStringStructure() {
        return new NaturalLanguageStringStructure();
    }

    /**
     * Create an instance of {@link StopPointVersionedRefStructure }
     * 
     */
    public StopPointVersionedRefStructure createStopPointVersionedRefStructure() {
        return new StopPointVersionedRefStructure();
    }

    /**
     * Create an instance of {@link Organisation }
     * 
     */
    public Organisation createOrganisation() {
        return new Organisation();
    }

    /**
     * Create an instance of {@link DataRightStructure.DataPolicy }
     * 
     */
    public DataRightStructure.DataPolicy createDataRightStructureDataPolicy() {
        return new DataRightStructure.DataPolicy();
    }

    /**
     * Create an instance of {@link AdministrativeAreaVersionedRefStructure }
     * 
     */
    public AdministrativeAreaVersionedRefStructure createAdministrativeAreaVersionedRefStructure() {
        return new AdministrativeAreaVersionedRefStructure();
    }

    /**
     * Create an instance of {@link ClosedDateRangeCollectionStructure }
     * 
     */
    public ClosedDateRangeCollectionStructure createClosedDateRangeCollectionStructure() {
        return new ClosedDateRangeCollectionStructure();
    }

    /**
     * Create an instance of {@link OpenDateRangeStructure }
     * 
     */
    public OpenDateRangeStructure createOpenDateRangeStructure() {
        return new OpenDateRangeStructure();
    }

    /**
     * Create an instance of {@link AlternativeDescriptorStructure }
     * 
     */
    public AlternativeDescriptorStructure createAlternativeDescriptorStructure() {
        return new AlternativeDescriptorStructure();
    }

    /**
     * Create an instance of {@link AnnotatedAirRefStructure }
     * 
     */
    public AnnotatedAirRefStructure createAnnotatedAirRefStructure() {
        return new AnnotatedAirRefStructure();
    }

    /**
     * Create an instance of {@link RailStopClassificationStructure }
     * 
     */
    public RailStopClassificationStructure createRailStopClassificationStructure() {
        return new RailStopClassificationStructure();
    }

    /**
     * Create an instance of {@link StopClassificationStructure.OnStreet }
     * 
     */
    public StopClassificationStructure.OnStreet createStopClassificationStructureOnStreet() {
        return new StopClassificationStructure.OnStreet();
    }

    /**
     * Create an instance of {@link NptgLocalityVersionedRefStructure }
     * 
     */
    public NptgLocalityVersionedRefStructure createNptgLocalityVersionedRefStructure() {
        return new NptgLocalityVersionedRefStructure();
    }

    /**
     * Create an instance of {@link DescriptorStructure }
     * 
     */
    public DescriptorStructure createDescriptorStructure() {
        return new DescriptorStructure();
    }

    /**
     * Create an instance of {@link LiftCableCarStopClassificationStructure }
     * 
     */
    public LiftCableCarStopClassificationStructure createLiftCableCarStopClassificationStructure() {
        return new LiftCableCarStopClassificationStructure();
    }

    /**
     * Create an instance of {@link LocationStructure }
     * 
     */
    public LocationStructure createLocationStructure() {
        return new LocationStructure();
    }

    /**
     * Create an instance of {@link RegionRefStructure }
     * 
     */
    public RegionRefStructure createRegionRefStructure() {
        return new RegionRefStructure();
    }

    /**
     * Create an instance of {@link PlusbusZoneVersionedRefStructure }
     * 
     */
    public PlusbusZoneVersionedRefStructure createPlusbusZoneVersionedRefStructure() {
        return new PlusbusZoneVersionedRefStructure();
    }

    /**
     * Create an instance of {@link AlternativeDescriptorsStructure }
     * 
     */
    public AlternativeDescriptorsStructure createAlternativeDescriptorsStructure() {
        return new AlternativeDescriptorsStructure();
    }

    /**
     * Create an instance of {@link StopPoint }
     * 
     */
    public StopPoint createStopPoint() {
        return new StopPoint();
    }

    /**
     * Create an instance of {@link TelephoneContactStructure }
     * 
     */
    public TelephoneContactStructure createTelephoneContactStructure() {
        return new TelephoneContactStructure();
    }

    /**
     * Create an instance of {@link BusAndCoachStopClassificationStructure }
     * 
     */
    public BusAndCoachStopClassificationStructure createBusAndCoachStopClassificationStructure() {
        return new BusAndCoachStopClassificationStructure();
    }

    /**
     * Create an instance of {@link AnnotatedFerryRefStructure }
     * 
     */
    public AnnotatedFerryRefStructure createAnnotatedFerryRefStructure() {
        return new AnnotatedFerryRefStructure();
    }

    /**
     * Create an instance of {@link StopPointRefsStructure }
     * 
     */
    public StopPointRefsStructure createStopPointRefsStructure() {
        return new StopPointRefsStructure();
    }

    /**
     * Create an instance of {@link MetroStopClassificationStructure }
     * 
     */
    public MetroStopClassificationStructure createMetroStopClassificationStructure() {
        return new MetroStopClassificationStructure();
    }

    /**
     * Create an instance of {@link ClosedTimeRangeStructure }
     * 
     */
    public ClosedTimeRangeStructure createClosedTimeRangeStructure() {
        return new ClosedTimeRangeStructure();
    }

    /**
     * Create an instance of {@link DataRight }
     * 
     */
    public DataRight createDataRight() {
        return new DataRight();
    }

    /**
     * Create an instance of {@link StopAreaVersionedRefStructure }
     * 
     */
    public StopAreaVersionedRefStructure createStopAreaVersionedRefStructure() {
        return new StopAreaVersionedRefStructure();
    }

    /**
     * Create an instance of {@link WGS84PositionStructure }
     * 
     */
    public WGS84PositionStructure createWGS84PositionStructure() {
        return new WGS84PositionStructure();
    }

    /**
     * Create an instance of {@link BusAndCoachStopClassificationStructure.VariableBay }
     * 
     */
    public BusAndCoachStopClassificationStructure.VariableBay createBusAndCoachStopClassificationStructureVariableBay() {
        return new BusAndCoachStopClassificationStructure.VariableBay();
    }

    /**
     * Create an instance of {@link AnnotatedClosedDateRangeCollectionStructure }
     * 
     */
    public AnnotatedClosedDateRangeCollectionStructure createAnnotatedClosedDateRangeCollectionStructure() {
        return new AnnotatedClosedDateRangeCollectionStructure();
    }

    /**
     * Create an instance of {@link GridPositionStructure }
     * 
     */
    public GridPositionStructure createGridPositionStructure() {
        return new GridPositionStructure();
    }

    /**
     * Create an instance of {@link StopAvailabilityStructure }
     * 
     */
    public StopAvailabilityStructure createStopAvailabilityStructure() {
        return new StopAvailabilityStructure();
    }

    /**
     * Create an instance of {@link TaxiStopClassificationStructure }
     * 
     */
    public TaxiStopClassificationStructure createTaxiStopClassificationStructure() {
        return new TaxiStopClassificationStructure();
    }

    /**
     * Create an instance of {@link uk.org.naptan.Descriptor }
     * 
     */
    public uk.org.naptan.Descriptor createDescriptor() {
        return new uk.org.naptan.Descriptor();
    }

    /**
     * Create an instance of {@link StopAreaRefsStructure }
     * 
     */
    public StopAreaRefsStructure createStopAreaRefsStructure() {
        return new StopAreaRefsStructure();
    }

    /**
     * Create an instance of {@link DataRightStructure.TermsOfUse }
     * 
     */
    public DataRightStructure.TermsOfUse createDataRightStructureTermsOfUse() {
        return new DataRightStructure.TermsOfUse();
    }

    /**
     * Create an instance of {@link ExtensionsAnyStructure }
     * 
     */
    public ExtensionsAnyStructure createExtensionsAnyStructure() {
        return new ExtensionsAnyStructure();
    }

    /**
     * Create an instance of {@link MarkedPointStructure }
     * 
     */
    public MarkedPointStructure createMarkedPointStructure() {
        return new MarkedPointStructure();
    }

    /**
     * Create an instance of {@link FlexibleZoneStructure }
     * 
     */
    public FlexibleZoneStructure createFlexibleZoneStructure() {
        return new FlexibleZoneStructure();
    }

    /**
     * Create an instance of {@link BusStopClassificationStructure }
     * 
     */
    public BusStopClassificationStructure createBusStopClassificationStructure() {
        return new BusStopClassificationStructure();
    }

    /**
     * Create an instance of {@link RegionRefsStructure }
     * 
     */
    public RegionRefsStructure createRegionRefsStructure() {
        return new RegionRefsStructure();
    }

    /**
     * Create an instance of {@link DataRightStructure }
     * 
     */
    public DataRightStructure createDataRightStructure() {
        return new DataRightStructure();
    }

    /**
     * Create an instance of {@link BusAndCoachStopClassificationStructure.Bay }
     * 
     */
    public BusAndCoachStopClassificationStructure.Bay createBusAndCoachStopClassificationStructureBay() {
        return new BusAndCoachStopClassificationStructure.Bay();
    }

    /**
     * Create an instance of {@link StopValidity }
     * 
     */
    public StopValidity createStopValidity() {
        return new StopValidity();
    }

    /**
     * Create an instance of {@link StopPointWrappedRefStructure }
     * 
     */
    public StopPointWrappedRefStructure createStopPointWrappedRefStructure() {
        return new StopPointWrappedRefStructure();
    }

    /**
     * Create an instance of {@link LineStringStructure }
     * 
     */
    public LineStringStructure createLineStringStructure() {
        return new LineStringStructure();
    }

    /**
     * Create an instance of {@link StopPointsStructure }
     * 
     */
    public StopPointsStructure createStopPointsStructure() {
        return new StopPointsStructure();
    }

    /**
     * Create an instance of {@link AnnotatedStopPointRef }
     * 
     */
    public AnnotatedStopPointRef createAnnotatedStopPointRef() {
        return new AnnotatedStopPointRef();
    }

    /**
     * Create an instance of {@link HalfOpenDateTimeRangeStructure }
     * 
     */
    public HalfOpenDateTimeRangeStructure createHalfOpenDateTimeRangeStructure() {
        return new HalfOpenDateTimeRangeStructure();
    }

    /**
     * Create an instance of {@link MapSystemReferenceStructure }
     * 
     */
    public MapSystemReferenceStructure createMapSystemReferenceStructure() {
        return new MapSystemReferenceStructure();
    }

    /**
     * Create an instance of {@link BoundingBoxStructure }
     * 
     */
    public BoundingBoxStructure createBoundingBoxStructure() {
        return new BoundingBoxStructure();
    }

    /**
     * Create an instance of {@link AnnotatedStopPointRefStructure.Location }
     * 
     */
    public AnnotatedStopPointRefStructure.Location createAnnotatedStopPointRefStructureLocation() {
        return new AnnotatedStopPointRefStructure.Location();
    }

    /**
     * Create an instance of {@link NaturalLanguagePlaceNameStructure }
     * 
     */
    public NaturalLanguagePlaceNameStructure createNaturalLanguagePlaceNameStructure() {
        return new NaturalLanguagePlaceNameStructure();
    }

    /**
     * Create an instance of {@link AnnotatedClosedDateRangeStructure }
     * 
     */
    public AnnotatedClosedDateRangeStructure createAnnotatedClosedDateRangeStructure() {
        return new AnnotatedClosedDateRangeStructure();
    }

    /**
     * Create an instance of {@link OrganisationRefStructure }
     * 
     */
    public OrganisationRefStructure createOrganisationRefStructure() {
        return new OrganisationRefStructure();
    }

    /**
     * Create an instance of {@link StopAreaStructure }
     * 
     */
    public StopAreaStructure createStopAreaStructure() {
        return new StopAreaStructure();
    }

    /**
     * Create an instance of {@link DataRightsStructure }
     * 
     */
    public DataRightsStructure createDataRightsStructure() {
        return new DataRightsStructure();
    }

    /**
     * Create an instance of {@link StopClassificationStructure }
     * 
     */
    public StopClassificationStructure createStopClassificationStructure() {
        return new StopClassificationStructure();
    }

    /**
     * Create an instance of {@link AdministrativeAreaRefsStructure }
     * 
     */
    public AdministrativeAreaRefsStructure createAdministrativeAreaRefsStructure() {
        return new AdministrativeAreaRefsStructure();
    }

    /**
     * Create an instance of {@link AirStopClassificationStructure }
     * 
     */
    public AirStopClassificationStructure createAirStopClassificationStructure() {
        return new AirStopClassificationStructure();
    }

    /**
     * Create an instance of {@link VersionedObjectTimestampedStructure }
     * 
     */
    public VersionedObjectTimestampedStructure createVersionedObjectTimestampedStructure() {
        return new VersionedObjectTimestampedStructure();
    }

    /**
     * Create an instance of {@link StopClassificationStructure.OffStreet }
     * 
     */
    public StopClassificationStructure.OffStreet createStopClassificationStructureOffStreet() {
        return new StopClassificationStructure.OffStreet();
    }

    /**
     * Create an instance of {@link DailyOpeningHoursStructure }
     * 
     */
    public DailyOpeningHoursStructure createDailyOpeningHoursStructure() {
        return new DailyOpeningHoursStructure();
    }

    /**
     * Create an instance of {@link PlaceRefStructure }
     * 
     */
    public PlaceRefStructure createPlaceRefStructure() {
        return new PlaceRefStructure();
    }

    /**
     * Create an instance of {@link DateCollectionStructure }
     * 
     */
    public DateCollectionStructure createDateCollectionStructure() {
        return new DateCollectionStructure();
    }

    /**
     * Create an instance of {@link DeltaListStructure }
     * 
     */
    public DeltaListStructure createDeltaListStructure() {
        return new DeltaListStructure();
    }

    /**
     * Create an instance of {@link AdministrativeAreaRefStructure }
     * 
     */
    public AdministrativeAreaRefStructure createAdministrativeAreaRefStructure() {
        return new AdministrativeAreaRefStructure();
    }

    /**
     * Create an instance of {@link HailAndRideSectionStructure }
     * 
     */
    public HailAndRideSectionStructure createHailAndRideSectionStructure() {
        return new HailAndRideSectionStructure();
    }

    /**
     * Create an instance of {@link CarStopClassificationStructure }
     * 
     */
    public CarStopClassificationStructure createCarStopClassificationStructure() {
        return new CarStopClassificationStructure();
    }

    /**
     * Create an instance of {@link HalfOpenTimeRangeStructure }
     * 
     */
    public HalfOpenTimeRangeStructure createHalfOpenTimeRangeStructure() {
        return new HalfOpenTimeRangeStructure();
    }

    /**
     * Create an instance of {@link ClosedDateRangeStructure }
     * 
     */
    public ClosedDateRangeStructure createClosedDateRangeStructure() {
        return new ClosedDateRangeStructure();
    }

    /**
     * Create an instance of {@link LocationStructure.Translation }
     * 
     */
    public LocationStructure.Translation createLocationStructureTranslation() {
        return new LocationStructure.Translation();
    }

    /**
     * Create an instance of {@link PlusbusZoneRefsStructure }
     * 
     */
    public PlusbusZoneRefsStructure createPlusbusZoneRefsStructure() {
        return new PlusbusZoneRefsStructure();
    }

    /**
     * Create an instance of {@link FerryStopClassificationStructure }
     * 
     */
    public FerryStopClassificationStructure createFerryStopClassificationStructure() {
        return new FerryStopClassificationStructure();
    }

    /**
     * Create an instance of {@link NaPTAN }
     * 
     */
    public NaPTAN createNaPTAN() {
        return new NaPTAN();
    }

    /**
     * Create an instance of {@link BearingStructure }
     * 
     */
    public BearingStructure createBearingStructure() {
        return new BearingStructure();
    }

    /**
     * Create an instance of {@link PlusbusZoneRefStructure }
     * 
     */
    public PlusbusZoneRefStructure createPlusbusZoneRefStructure() {
        return new PlusbusZoneRefStructure();
    }

    /**
     * Create an instance of {@link StopAreaWrappedRefStructure }
     * 
     */
    public StopAreaWrappedRefStructure createStopAreaWrappedRefStructure() {
        return new StopAreaWrappedRefStructure();
    }

    /**
     * Create an instance of {@link StopValidityStructure }
     * 
     */
    public StopValidityStructure createStopValidityStructure() {
        return new StopValidityStructure();
    }

    /**
     * Create an instance of {@link StopAreaRefStructure }
     * 
     */
    public StopAreaRefStructure createStopAreaRefStructure() {
        return new StopAreaRefStructure();
    }

    /**
     * Create an instance of {@link UnmarkedPointStructure }
     * 
     */
    public UnmarkedPointStructure createUnmarkedPointStructure() {
        return new UnmarkedPointStructure();
    }

    /**
     * Create an instance of {@link FullPersonNameStructure }
     * 
     */
    public FullPersonNameStructure createFullPersonNameStructure() {
        return new FullPersonNameStructure();
    }

    /**
     * Create an instance of {@link StopAreasStructure }
     * 
     */
    public StopAreasStructure createStopAreasStructure() {
        return new StopAreasStructure();
    }

    /**
     * Create an instance of {@link MapStructure }
     * 
     */
    public MapStructure createMapStructure() {
        return new MapStructure();
    }

    /**
     * Create an instance of {@link RegionVersionedRefStructure }
     * 
     */
    public RegionVersionedRefStructure createRegionVersionedRefStructure() {
        return new RegionVersionedRefStructure();
    }

    /**
     * Create an instance of {@link StopPointStructure }
     * 
     */
    public StopPointStructure createStopPointStructure() {
        return new StopPointStructure();
    }

    /**
     * Create an instance of {@link StopClassificationStructure.OnStreet.Taxi }
     * 
     */
    public StopClassificationStructure.OnStreet.Taxi createStopClassificationStructureOnStreetTaxi() {
        return new StopClassificationStructure.OnStreet.Taxi();
    }

    /**
     * Create an instance of {@link StopPointRefStructure }
     * 
     */
    public StopPointRefStructure createStopPointRefStructure() {
        return new StopPointRefStructure();
    }

    /**
     * Create an instance of {@link LocationRefStructure }
     * 
     */
    public LocationRefStructure createLocationRefStructure() {
        return new LocationRefStructure();
    }

    /**
     * Create an instance of {@link AnnotatedMetroRefStructure }
     * 
     */
    public AnnotatedMetroRefStructure createAnnotatedMetroRefStructure() {
        return new AnnotatedMetroRefStructure();
    }

    /**
     * Create an instance of {@link ContributorStructure }
     * 
     */
    public ContributorStructure createContributorStructure() {
        return new ContributorStructure();
    }

    /**
     * Create an instance of {@link AnnotatedCoachRefStructure }
     * 
     */
    public AnnotatedCoachRefStructure createAnnotatedCoachRefStructure() {
        return new AnnotatedCoachRefStructure();
    }

    /**
     * Create an instance of {@link NptgLocalityRefStructure }
     * 
     */
    public NptgLocalityRefStructure createNptgLocalityRefStructure() {
        return new NptgLocalityRefStructure();
    }

    /**
     * Create an instance of {@link AlternativeDescriptorsStructure.Descriptor }
     * 
     */
    public AlternativeDescriptorsStructure.Descriptor createAlternativeDescriptorsStructureDescriptor() {
        return new AlternativeDescriptorsStructure.Descriptor();
    }

    /**
     * Create an instance of {@link DataRightStructure.Copyright }
     * 
     */
    public DataRightStructure.Copyright createDataRightStructureCopyright() {
        return new DataRightStructure.Copyright();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionedObjectTimestampedStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "VersionedObjectTimestamped", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedObject")
    public JAXBElement<VersionedObjectTimestampedStructure> createVersionedObjectTimestamped(VersionedObjectTimestampedStructure value) {
        return new JAXBElement<VersionedObjectTimestampedStructure>(_VersionedObjectTimestamped_QNAME, VersionedObjectTimestampedStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "StopPoint", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedObjectTimestamped")
    public JAXBElement<StopPoint> createStopPoint(StopPoint value) {
        return new JAXBElement<StopPoint>(_StopPoint_QNAME, StopPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contributor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "Contributor", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedObject")
    public JAXBElement<Contributor> createContributor(Contributor value) {
        return new JAXBElement<Contributor>(_Contributor_QNAME, Contributor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationSystemEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "LocationSystem", defaultValue = "Grid")
    public JAXBElement<LocationSystemEnumeration> createLocationSystem(LocationSystemEnumeration value) {
        return new JAXBElement<LocationSystemEnumeration>(_LocationSystem_QNAME, LocationSystemEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HalfOpenDateTimeRangeStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "ValidityPeriod")
    public JAXBElement<HalfOpenDateTimeRangeStructure> createValidityPeriod(HalfOpenDateTimeRangeStructure value) {
        return new JAXBElement<HalfOpenDateTimeRangeStructure>(_ValidityPeriod_QNAME, HalfOpenDateTimeRangeStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "StopArea", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedObjectTimestamped")
    public JAXBElement<StopArea> createStopArea(StopArea value) {
        return new JAXBElement<StopArea>(_StopArea_QNAME, StopArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link uk.org.naptan.Descriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "Descriptor", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedChild")
    public JAXBElement<uk.org.naptan.Descriptor> createDescriptor(uk.org.naptan.Descriptor value) {
        return new JAXBElement<uk.org.naptan.Descriptor>(_Descriptor_QNAME, uk.org.naptan.Descriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopValidity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "StopValidity", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedChild")
    public JAXBElement<StopValidity> createStopValidity(StopValidity value) {
        return new JAXBElement<StopValidity>(_StopValidity_QNAME, StopValidity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnotatedCrossRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "AnnotatedCrossRef", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedChild")
    public JAXBElement<AnnotatedCrossRefStructure> createAnnotatedCrossRef(AnnotatedCrossRefStructure value) {
        return new JAXBElement<AnnotatedCrossRefStructure>(_AnnotatedCrossRef_QNAME, AnnotatedCrossRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionsAnyStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "Extensions")
    public JAXBElement<ExtensionsAnyStructure> createExtensions(ExtensionsAnyStructure value) {
        return new JAXBElement<ExtensionsAnyStructure>(_Extensions_QNAME, ExtensionsAnyStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionedChildStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "VersionedChild", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedObject")
    public JAXBElement<VersionedChildStructure> createVersionedChild(VersionedChildStructure value) {
        return new JAXBElement<VersionedChildStructure>(_VersionedChild_QNAME, VersionedChildStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionedObjectStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "VersionedObject")
    public JAXBElement<VersionedObjectStructure> createVersionedObject(VersionedObjectStructure value) {
        return new JAXBElement<VersionedObjectStructure>(_VersionedObject_QNAME, VersionedObjectStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataRight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "DataRight", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedChild")
    public JAXBElement<DataRight> createDataRight(DataRight value) {
        return new JAXBElement<DataRight>(_DataRight_QNAME, DataRight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organisation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.naptan.org.uk/", name = "Organisation", substitutionHeadNamespace = "http://www.naptan.org.uk/", substitutionHeadName = "VersionedObject")
    public JAXBElement<Organisation> createOrganisation(Organisation value) {
        return new JAXBElement<Organisation>(_Organisation_QNAME, Organisation.class, null, value);
    }

}
