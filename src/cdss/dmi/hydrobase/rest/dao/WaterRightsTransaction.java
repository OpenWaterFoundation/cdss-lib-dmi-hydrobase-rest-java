package cdss.dmi.hydrobase.rest.dao;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class acts as a way to convert results from DWR web services
 * to a plain old java object, for means of processing the data 
 * returned.
 * https://dnrweb.state.co.us/DWR/DwrApiService/Help/Api/GET-api-v2-waterrights-transaction
 * @author jurentie
 */

/**
 * Ignore any properties defined after defining this class.
 * If properties are added that are necessary to data processing these can be added,
 * but for now ignore anything that is new so as to not break the code.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WaterRightsTransaction {

	/**
	 * Variables defined in alphabetical order. 
	 * Documentation copied from web services.
	 */
	
	/**
	 * Adjudication date is the date that the water right was awarded by the water court.
	 */
	private LocalDateTime adjudicationDate;
	
	/**
	 * Type of adjudication
	 */
	private String adjudicationType;
	
	/**
	 * 	A calculated number developed by DWR to rank water rights in order of seniority. 
	 */
	private double adminNumber;
	
	/**
	 * The date that water was first put to a specific beneficial use or the date that an open, 
	 * overt act was taken at the intended point of diversion to demonstrate an intent to apply 
	 * water for beneficial use.
	 */
	private LocalDateTime appropriationDate;
	
	/**
	 * WDID of structure associated with selected structure
	 */
	private String associatedWdid;
	
	/**
	 * Water Court case number associated with water right transaction
	 */
	private String caseNumber;
	
	/**
	 * Hyperlink to Water Court case
	 */
	private String caseNumberUrl;
	
	/**
	 * Comments
	 */
	private String comments;
	
	/**
	 * Distance and direction from East/West section line (feet)
	 */
	private int coordinatesEw;
	
	/**
	 * Direction of measurement from East/West section line
	 */
	private String coordinatesEwDir;

	/**
	 * Distance and direction from North/South section line (feet)
	 */
	private int coordinatesNs;
	
	/**
	 * Direction of measurement from North/South section line
	 */
	private String coordinatesNsDir;
	
	/*
	 * County where the well is located
	 */
	private String county;
	
	/**
	 * Beneficial uses of water right: • 0 - STORAGE • 1 - IRRIGATION • 2 - MUNICIPAL • 3 - COMMERCIAL 
	 * • 4- INDUSTRIAL • 5 - RECREATION • 6 - FISHERY • 7 - FIRE • 8 - DOMESTIC • 9 - STOCK 
	 * • A - AUGMENTATION • B - EXPORT FROM BASIN • C - CUMULATIVE ACCRETION TO RIVER 
	 * • D - CUMULATIVE DEPLETION FROM RIVER • E - EVAPORATIVE • F - FEDERAL RESERVED 
	 * • G - GEOTHERMAL • H - HOUSEHOLD USE ONLY • K - SNOW MAKING • M - MINIMUM STREAMFLOW 
	 * • N - NET EFFECT ON RIVER • P - POWER GENERATION • Q - OTHER • R - RECHARGE • S - EXPORT FROM STATE 
	 * • T - TRANSMOUNTAIN EXPORT • W - WILDLIFE • X - ALL BENEFICIAL USES
	 */
	private String decreedUses;
	
	/**
	 * DWR Water Division
	 */
	private int division;
	
	/**
	 * National Hydrographic Dataset stream identifier
	 */
	private String gnisId;
	
	/**
	 * Last date time that this record was modified in the DWR database
	 */
	private LocalDateTime lastModified;
	
	/**
	 * Latitude value in decimal degrees
	 */
	private double latitude;
	
	/**
	 * Accuracy of location coordinates
	 */
	private String locationAccuracy;
	
	/**
	 * Longitude (decimal degrees)
	 */
	private double longitude;
	
	/**
	 * The maximum annual decreed rate (CFS). Decrees may have seasonal rates that differ from 
	 * this amount
	 */
	private double maxDecreedRate;
	
	/**
	 * Hyperlink to additional details
	 */
	private String moreInformation;
	
	/**
	 * Used to distinguish the priority of multiple water rights with identical dates
	 */
	private int orderNumber;
	
	/**
	 * Well permit number
	 */
	private String permit;
	
	/**
	 * Type of association plan
	 */
	private String planType;
	
	/**
	 * WDID of association plan
	 */
	private String planWdid;
	
	/**
	 * Principal Meridian of well’s legal location - there are 5 principal meridians in CO: 
	 * Sixth (S), New Mexico (N), Baca (B), Costilla (C), and Ute (U)
	 */
	private String pm;
	
	/**
	 * The previous adjudication date field allows water rights to be ordered by priority with all 
	 * rights awarded subsequent to a previous adjudication being junior
	 */
	private LocalDateTime priorAdjudicationDate;
	
	/**
	 * An early District Court's method to indicate a water right's seniority in water drainage
	 */
	private String priorityNumber;
	
	/**
	 * Legal location: 10 acre quarter section
	 */
	private String q10;
	
	/**
	 * Legal location: 160 acre quarter section
	 */
	private String q160;
	
	/**
	 * Legal Location: 40 acre quarter section
	 */
	private String q40;
	
	/**
	 * Legal location: A number in the format “nnnd” where “nnn” is the range number and “d” is the direction 
	 * either East or West
	 */
	private String range;
	
	/**
	 * Flag indicating that the water right has decreed amounts that vary by date
	 */
	private String seasonalLimitation;
	
	/**
	 * Section number - township, range divided into 36 one square mile sections; “U” indicates location in 
	 * Ute Correction (Division 7 only)
	 */
	private String section;
	
	/**
	 * Date decree was signed
	 */
	private LocalDateTime signatureDate;
	
	/**
	 * Distance in miles to the confluence with the next downstream water source 
	 * (or distance to state line)
	 */
	private double streamMile;
	
	/**
	 * Type of Structure
	 */
	private String structureType;
	
	/**
	 * The maximum annual decreed volumetric limit (AF). Decrees may have seasonal rates that 
	 * differ from this amount
	 */
	private double totalVolumetricLimit;

	/**
	 * Legal location: Township number and direction
	 */
	private String township;
	
	/**
	 * The x (Easting) component of the Universal Transverse Mercator system. 
	 * (Zone 12, NAD83 datum)
	 */
	private double utmX;
	
	/**
	 * The y (Northing) component of the Universal Transverse Mercator system. 
	 * (Zone 12, NAD83 datum)
	 */
	private double utmY;
	
	/**
	 * DWR Water District
	 */
	private int waterDistrict;

	/**
	 * Name of structure associated with water right
	 */
	private String waterRightName;
	
	/**
	 * NA
	 */
	private int waterRightNum;
	
	/**
	 * Name of the water source as specified in the court case
	 */
	private String waterSource;
	
	/**
	 * DWR unique structure identifier
	 */
	private String wdid;
	
	/**
	 * Getters and setters for defined variables
	 */
	public LocalDateTime getAdjudicationDate() {
		return adjudicationDate;
	}

	public String getAdjudicationType() {
		return adjudicationType;
	}

	public double getAdminNumber() {
		return adminNumber;
	}

	public LocalDateTime getAppropriationDate() {
		return appropriationDate;
	}

	public String getAssociatedWdid() {
		return associatedWdid;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public String getCaseNumberUrl() {
		return caseNumberUrl;
	}

	public String getComments() {
		return comments;
	}

	public String getCoordinatesEwDir() {
		return coordinatesEwDir;
	}

	public int getCoordinatesEw() {
		return coordinatesEw;
	}

	public int getCoordinatesNs() {
		return coordinatesNs;
	}

	public String getCoordinatesNsDir() {
		return coordinatesNsDir;
	}

	public String getCounty() {
		return county;
	}

	public String getDecreedUses() {
		return decreedUses;
	}

	public int getDivision() {
		return division;
	}

	public String getGnisId() {
		return gnisId;
	}

	public LocalDateTime getLastModified() {
		return lastModified;
	}

	public double getLatitude() {
		return latitude;
	}

	public String getLocationAccuracy() {
		return locationAccuracy;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getMaxDecreedRate() {
		return maxDecreedRate;
	}

	public String getMoreInformation() {
		return moreInformation;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getPermit() {
		return permit;
	}

	public String getPlanType() {
		return planType;
	}

	public String getPlanWdid() {
		return planWdid;
	}

	public String getPm() {
		return pm;
	}

	public LocalDateTime getPriorAdjudicationDate() {
		return priorAdjudicationDate;
	}

	public String getPriorityNumber() {
		return priorityNumber;
	}

	public String getQ10() {
		return q10;
	}

	public String getQ160() {
		return q160;
	}

	public String getQ40() {
		return q40;
	}

	public String getRange() {
		return range;
	}

	public String getSeasonalLimitation() {
		return seasonalLimitation;
	}

	public String getSection() {
		return section;
	}

	public LocalDateTime getSignatureDate() {
		return signatureDate;
	}

	public double getStreamMile() {
		return streamMile;
	}

	public String getStructureType() {
		return structureType;
	}

	public double getTotalVolumetricLimit() {
		return totalVolumetricLimit;
	}

	public String getTownship() {
		return township;
	}

	public double getUtmX() {
		return utmX;
	}

	public double getUtmY() {
		return utmY;
	}

	public int getWaterDistrict() {
		return waterDistrict;
	}

	public String getWaterRightName() {
		return waterRightName;
	}

	public int getWaterRightNum() {
		return waterRightNum;
	}

	public String getWaterSource() {
		return waterSource;
	}

	public String getWdid() {
		return wdid;
	}

	public void setAdjudicationDate(String adjudicationDate) {
		this.adjudicationDate = (adjudicationDate == null) ? null : LocalDateTime.parse(adjudicationDate);
	}

	public void setAdjudicationType(String adjudicationType) {
		this.adjudicationType = adjudicationType;
	}

	public void setAdminNumber(double adminNumber) {
		this.adminNumber = adminNumber;
	}

	public void setAppropriationDate(String appropriationDate) {
		this.appropriationDate = (appropriationDate == null) ? null : LocalDateTime.parse(appropriationDate);
	}

	public void setAssociatedWdid(String associatedWdid) {
		this.associatedWdid = associatedWdid;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public void setCaseNumberUrl(String caseNumberUrl) {
		this.caseNumberUrl = caseNumberUrl;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setCoordinatesEwDir(String coordiantesEwDir) {
		this.coordinatesEwDir = coordiantesEwDir;
	}

	public void setCoordinatesEw(int coordinatesEw) {
		this.coordinatesEw = coordinatesEw;
	}

	public void setCoordinatesNs(int coordinatesNs) {
		this.coordinatesNs = coordinatesNs;
	}

	public void setCoordinatesNsDir(String coordinatesNsDir) {
		this.coordinatesNsDir = coordinatesNsDir;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setDecreedUses(String decreedUses) {
		this.decreedUses = decreedUses;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public void setGnisId(String gnisId) {
		this.gnisId = gnisId;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = (lastModified == null) ? null : LocalDateTime.parse(lastModified);
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLocationAccuracy(String locationAccuracy) {
		this.locationAccuracy = locationAccuracy;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void setMaxDecreedRate(double maxDecreedRate) {
		this.maxDecreedRate = maxDecreedRate;
	}

	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public void setPlanWdid(String planWdid) {
		this.planWdid = planWdid;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public void setPriorAdjudicationDate(String priorAdjudicationDate) {
		this.priorAdjudicationDate = (priorAdjudicationDate == null) ? null : LocalDateTime.parse(priorAdjudicationDate);
	}

	public void setPriorityNumber(String priorityNumber) {
		this.priorityNumber = priorityNumber;
	}

	public void setQ10(String q10) {
		this.q10 = q10;
	}

	public void setQ160(String q160) {
		this.q160 = q160;
	}

	public void setQ40(String q40) {
		this.q40 = q40;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public void setSeasonalLimitation(String seasonalLimitation) {
		this.seasonalLimitation = seasonalLimitation;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void setSignatureDate(String signatureDate) {
		this.signatureDate = (signatureDate == null) ? null : LocalDateTime.parse(signatureDate);
	}

	public void setStreamMile(double streamMile) {
		this.streamMile = streamMile;
	}

	public void setStructureType(String structureType) {
		this.structureType = structureType;
	}

	public void setTotalVolumetricLimit(double totalVolumetricLimit) {
		this.totalVolumetricLimit = totalVolumetricLimit;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public void setUtmX(double utmX) {
		this.utmX = utmX;
	}

	public void setUtmY(double utmY) {
		this.utmY = utmY;
	}

	public void setWaterDistrict(int waterDistrict) {
		this.waterDistrict = waterDistrict;
	}

	public void setWaterRightName(String waterRightName) {
		this.waterRightName = waterRightName;
	}

	public void setWaterRightNum(int waterRightNum) {
		this.waterRightNum = waterRightNum;
	}

	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}

	public void setWdid(String wdid) {
		this.wdid = wdid;
	}
	
	/**
	 * To string method for testing purposes:
	 * Variables defined in order of how they are returned in a json format from
	 * web services
	 */
	@Override 
	public String toString() {
		return "WaterRightsTransaction: [ waterRightNum: " + waterRightNum +  ", wdid: " + wdid +
				", waterRightName: " + waterRightName + ", structureType: " + structureType + ", permit" +
				permit + ", waterSource: " + waterSource + ", streamMile: " + streamMile + ", gnisId: " +
				gnisId + ", division: " + division + ", waterDistrict: " + waterDistrict + ", county: " +
				county + ", q10: " + q10 + ", q40: " + q40 + ", q160: " + ", section: " + section + 
				", township: " + township + ", range: " + range + ", pm: " + pm + ", coordinatesEw: " +
				coordinatesEw + ", coordinatesEwDir: " + coordinatesEwDir + ", coordinatesNs: " + coordinatesNs +
				", coordinatesNsDir: " + coordinatesNsDir + ", utmX: " + utmX + "utmY: " + utmY + 
				", latitude: " + latitude + ", longitude: " + longitude + ", locationAccuracy: " +
				locationAccuracy + ", adjudicationType: " + adjudicationType + ", adjudicationDate: " +
				adjudicationDate + ", signatureDate: " + signatureDate + ", adminNumber: " + adminNumber + 
				", orderNumber: " + orderNumber + ", priorityNumber: " + priorityNumber + ", caseNumber: " +
				caseNumber + ", caseNumberUrl: " + caseNumberUrl + ", decreedUses: " + decreedUses + 
				", maxDecreedRate: " + maxDecreedRate + ", totalVolumetricLimit: " + totalVolumetricLimit + 
				", seasonalLimitation: " + seasonalLimitation + ", associatedWdid: " + associatedWdid + 
				", planType: " + planType + ", planWdid: " + planWdid + ", comments: " + comments + ", lastModified: " +
				lastModified + ", moreInformation: " + moreInformation + " ]";
	}

}


