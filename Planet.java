class Planet {
    
    String planetName;
    double planetMass;
    double planetDiameter;
    double planetGravity;
    double planetOrbitalPeriod;
    boolean hasRings;
    int numberOfMoons;
    boolean hasLife;
    String atmosphereComposition;
    String planetType;
    double averageTemperature;
    double distanceFromSun;
    boolean isDwarfPlanet;
    boolean hasMagneticField;
    boolean isTerrestrial;
    boolean hasWater;
    double rotationPeriod;
    boolean isHabitable;
    String discoveredBy;
    int discoveryYear;

    public Planet(String planetName, double planetMass, double planetDiameter, double planetGravity, 
                  double planetOrbitalPeriod, boolean hasRings, int numberOfMoons, boolean hasLife, 
                  String atmosphereComposition, String planetType, double averageTemperature, 
                  double distanceFromSun, boolean isDwarfPlanet, boolean hasMagneticField, boolean isTerrestrial, 
                  boolean hasWater, double rotationPeriod, boolean isHabitable, String discoveredBy, int discoveryYear) {

        this.planetName = planetName;
        this.planetMass = planetMass;
        this.planetDiameter = planetDiameter;
        this.planetGravity = planetGravity;
        this.planetOrbitalPeriod = planetOrbitalPeriod;
        this.hasRings = hasRings;
        this.numberOfMoons = numberOfMoons;
        this.hasLife = hasLife;
        this.atmosphereComposition = atmosphereComposition;
        this.planetType = planetType;
        this.averageTemperature = averageTemperature;
        this.distanceFromSun = distanceFromSun;
        this.isDwarfPlanet = isDwarfPlanet;
        this.hasMagneticField = hasMagneticField;
        this.isTerrestrial = isTerrestrial;
        this.hasWater = hasWater;
        this.rotationPeriod = rotationPeriod;
        this.isHabitable = isHabitable;
        this.discoveredBy = discoveredBy;
        this.discoveryYear = discoveryYear;
    }
}

