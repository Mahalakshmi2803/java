class Rocket {
    
    String rocketName;
    String rocketType;
    double rocketHeight;
    double rocketWeight;
    String fuelType;
    int stages;
    boolean isReusable;
    double payloadCapacity;
    String manufacturer;
    String countryOfOrigin;
    double launchCost;
    int maxSpeed;
    String launchSite;
    int crewCapacity;
    boolean hasAutonomousNavigation;
    int manufacturingYear;
    boolean isNuclearPowered;
    boolean hasEscapeSystem;
    String missionType;
    int successfulMissions;

    public Rocket(String rocketName, String rocketType, double rocketHeight, double rocketWeight, String fuelType, 
                  int stages, boolean isReusable, double payloadCapacity, String manufacturer, String countryOfOrigin, 
                  double launchCost, int maxSpeed, String launchSite, int crewCapacity, 
                  boolean hasAutonomousNavigation, int manufacturingYear, boolean isNuclearPowered, 
                  boolean hasEscapeSystem, String missionType, int successfulMissions) {

        this.rocketName = rocketName;
        this.rocketType = rocketType;
        this.rocketHeight = rocketHeight;
        this.rocketWeight = rocketWeight;
        this.fuelType = fuelType;
        this.stages = stages;
        this.isReusable = isReusable;
        this.payloadCapacity = payloadCapacity;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.launchCost = launchCost;
        this.maxSpeed = maxSpeed;
        this.launchSite = launchSite;
        this.crewCapacity = crewCapacity;
        this.hasAutonomousNavigation = hasAutonomousNavigation;
        this.manufacturingYear = manufacturingYear;
        this.isNuclearPowered = isNuclearPowered;
        this.hasEscapeSystem = hasEscapeSystem;
        this.missionType = missionType;
        this.successfulMissions = successfulMissions;
    }
}

