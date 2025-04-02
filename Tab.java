class Tab {
    
    String brand;
    String model;
    double screenSize;
    String resolution;
    int ramSize;
    int storageCapacity;
    String processor;
    String operatingSystem;
    double batteryCapacity;
    boolean hasSIMSupport;
    boolean hasStylusSupport;
    boolean hasExpandableStorage;
    int cameraMP;
    boolean hasFaceRecognition;
    boolean hasFingerprintSensor;
    String connectivityOptions;
    String chargingPort;
    boolean has5GSupport;
    String countryOfOrigin;
    double price;

    public Tab(String brand, String model, double screenSize, String resolution, int ramSize, int storageCapacity, 
               String processor, String operatingSystem, double batteryCapacity, boolean hasSIMSupport, 
               boolean hasStylusSupport, boolean hasExpandableStorage, int cameraMP, boolean hasFaceRecognition, 
               boolean hasFingerprintSensor, String connectivityOptions, String chargingPort, boolean has5GSupport, 
               String countryOfOrigin, double price) {
        
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.batteryCapacity = batteryCapacity;
        this.hasSIMSupport = hasSIMSupport;
        this.hasStylusSupport = hasStylusSupport;
        this.hasExpandableStorage = hasExpandableStorage;
        this.cameraMP = cameraMP;
        this.hasFaceRecognition = hasFaceRecognition;
        this.hasFingerprintSensor = hasFingerprintSensor;
        this.connectivityOptions = connectivityOptions;
        this.chargingPort = chargingPort;
        this.has5GSupport = has5GSupport;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
    }
}