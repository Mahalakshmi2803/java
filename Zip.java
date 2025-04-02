class Zip {

    String zipType;
    String material;
    double length;
    String color;
    boolean isWaterResistant;
    boolean isAutoLock;
    String usageArea;
    boolean isEcoFriendly;
    String manufacturer;
    String countryOfOrigin;
    double price;
    int warrantyYears;
    double weight;
    boolean isReusable;
    boolean hasDoubleSlider;
    String teethMaterial;
    int manufacturingYear;
    boolean isRustResistant;

    public Zip(String zipType, String material, double length, String color, boolean isWaterResistant, 
               boolean isAutoLock, String usageArea, boolean isEcoFriendly, String manufacturer, 
               String countryOfOrigin, double price, int warrantyYears, double weight, boolean isReusable, 
               boolean hasDoubleSlider, String teethMaterial, int manufacturingYear, boolean isRustResistant) {

        this.zipType = zipType;
        this.material = material;
        this.length = length;
        this.color = color;
        this.isWaterResistant = isWaterResistant;
        this.isAutoLock = isAutoLock;
        this.usageArea = usageArea;
        this.isEcoFriendly = isEcoFriendly;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.warrantyYears = warrantyYears;
        this.weight = weight;
        this.isReusable = isReusable;
        this.hasDoubleSlider = hasDoubleSlider;
        this.teethMaterial = teethMaterial;
        this.manufacturingYear = manufacturingYear;
        this.isRustResistant = isRustResistant;
    }
}

