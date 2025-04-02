class Duster {

    String dusterType;
    String material;
    double length;
    double width;
    String color;
    boolean hasHandle;
    boolean isWashable;
    String usageArea;
    boolean isEcoFriendly;
    String manufacturer;
    String countryOfOrigin;
    double price;
    int warrantyYears;
    double weight;
    boolean isReusable;
    boolean hasReplaceableHead;
    String gripType;
    int manufacturingYear;
    boolean isAntiStatic;

    public Duster(String dusterType, String material, double length, double width, String color, boolean hasHandle,
                  boolean isWashable, String usageArea, boolean isEcoFriendly, String manufacturer, 
                  String countryOfOrigin, double price, int warrantyYears, double weight, boolean isReusable, 
                  boolean hasReplaceableHead, String gripType, int manufacturingYear, boolean isAntiStatic) {

        this.dusterType = dusterType;
        this.material = material;
        this.length = length;
        this.width = width;
        this.color = color;
        this.hasHandle = hasHandle;
        this.isWashable = isWashable;
        this.usageArea = usageArea;
        this.isEcoFriendly = isEcoFriendly;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.warrantyYears = warrantyYears;
        this.weight = weight;
        this.isReusable = isReusable;
        this.hasReplaceableHead = hasReplaceableHead;
        this.gripType = gripType;
        this.manufacturingYear = manufacturingYear;
        this.isAntiStatic = isAntiStatic;
    }
}

