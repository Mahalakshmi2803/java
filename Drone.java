class Drone {
    
    String modelName;
    String manufacturer;
    double weight;
    double maxFlightTime;
    double maxSpeed;
    double maxAltitude;
    double batteryCapacity;
    int numberOfRotors;
    boolean hasCamera;
    double cameraResolution;
    boolean hasGPS;
    boolean isAutonomous;
    String droneType;
    double range;
    boolean hasObstacleAvoidance;
    boolean isWaterResistant;
    String controlType;
    double price;
    int manufacturingYear;
    boolean hasNightVision;

    public Drone(String modelName, String manufacturer, double weight, double maxFlightTime, 
                 double maxSpeed, double maxAltitude, double batteryCapacity, int numberOfRotors, 
                 boolean hasCamera, double cameraResolution, boolean hasGPS, boolean isAutonomous, 
                 String droneType, double range, boolean hasObstacleAvoidance, boolean isWaterResistant, 
                 String controlType, double price, int manufacturingYear, boolean hasNightVision) {

        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.maxFlightTime = maxFlightTime;
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
        this.batteryCapacity = batteryCapacity;
        this.numberOfRotors = numberOfRotors;
        this.hasCamera = hasCamera;
        this.cameraResolution = cameraResolution;
        this.hasGPS = hasGPS;
        this.isAutonomous = isAutonomous;
        this.droneType = droneType;
        this.range = range;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.isWaterResistant = isWaterResistant;
        this.controlType = controlType;
        this.price = price;
        this.manufacturingYear = manufacturingYear;
        this.hasNightVision = hasNightVision;
    }
}

