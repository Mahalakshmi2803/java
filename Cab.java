class Cab {

    String cabType;
    String cabModel;
    String cabColor;
    int seatingCapacity;
    double farePerKm;
    boolean isACAvailable;
    String fuelType;
    double mileage;
    String transmissionType;
    boolean isElectric;
    String cabCompany;
    String countryOfOrigin;
    int manufacturingYear;
    boolean hasGPS;
    boolean hasWiFi;
    boolean isLuxury;
    double trunkCapacity;
    int safetyRating;
    boolean hasSunroof;
    boolean hasEntertainmentSystem;

    public Cab(String cabType, String cabModel, String cabColor, int seatingCapacity, double farePerKm, 
               boolean isACAvailable, String fuelType, double mileage, String transmissionType, boolean isElectric, 
               String cabCompany, String countryOfOrigin, int manufacturingYear, boolean hasGPS, boolean hasWiFi, 
               boolean isLuxury, double trunkCapacity, int safetyRating, boolean hasSunroof, boolean hasEntertainmentSystem) {

        this.cabType = cabType;
        this.cabModel = cabModel;
        this.cabColor = cabColor;
        this.seatingCapacity = seatingCapacity;
        this.farePerKm = farePerKm;
        this.isACAvailable = isACAvailable;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.transmissionType = transmissionType;
        this.isElectric = isElectric;
        this.cabCompany = cabCompany;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturingYear = manufacturingYear;
        this.hasGPS = hasGPS;
        this.hasWiFi = hasWiFi;
        this.isLuxury = isLuxury;
        this.trunkCapacity = trunkCapacity;
        this.safetyRating = safetyRating;
        this.hasSunroof = hasSunroof;
        this.hasEntertainmentSystem = hasEntertainmentSystem;
    }
}