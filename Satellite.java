class Satellite {
    
    String satelliteName;
    String satelliteType;
    double satelliteWeight;
    double satelliteHeight;
    String orbitType;
    String launchVehicle;
    int launchYear;
    boolean isGeostationary;
    double missionDuration;
    String manufacturer;
    String countryOfOrigin;
    boolean hasSolarPanels;
    double powerCapacity;
    String communicationBand;
    boolean isMilitaryUse;
    boolean hasAutonomousNavigation;
    int operationalLifespan;
    boolean isReusable;
    String missionPurpose;
    int successfulMissions;

    public Satellite(String satelliteName, String satelliteType, double satelliteWeight, double satelliteHeight, 
                     String orbitType, String launchVehicle, int launchYear, boolean isGeostationary, 
                     double missionDuration, String manufacturer, String countryOfOrigin, boolean hasSolarPanels, 
                     double powerCapacity, String communicationBand, boolean isMilitaryUse, 
                     boolean hasAutonomousNavigation, int operationalLifespan, boolean isReusable, 
                     String missionPurpose, int successfulMissions) {

        this.satelliteName = satelliteName;
        this.satelliteType = satelliteType;
        this.satelliteWeight = satelliteWeight;
        this.satelliteHeight = satelliteHeight;
        this.orbitType = orbitType;
        this.launchVehicle = launchVehicle;
        this.launchYear = launchYear;
        this.isGeostationary = isGeostationary;
        this.missionDuration = missionDuration;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.hasSolarPanels = hasSolarPanels;
        this.powerCapacity = powerCapacity;
        this.communicationBand = communicationBand;
        this.isMilitaryUse = isMilitaryUse;
        this.hasAutonomousNavigation = hasAutonomousNavigation;
        this.operationalLifespan = operationalLifespan;
        this.isReusable = isReusable;
        this.missionPurpose = missionPurpose;
        this.successfulMissions = successfulMissions;
    }
}

