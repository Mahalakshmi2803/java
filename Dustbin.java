class Dustbin {
    
    String binType;
    String binMaterial;
    double binCapacity;
    String binColor;
    boolean hasLid;
    boolean isRecyclable;
    String binShape;
    boolean hasFootPedal;
    String usageArea;
    boolean isSmartBin;
    String manufacturer;
    String countryOfOrigin;
    double binPrice;
    int warrantyYears;
    double binWeight;
    boolean isOdorControl;
    boolean hasPartition;
    String openingMechanism;
    int manufacturingYear;
    boolean isFireResistant;

    public Dustbin(String binType, String binMaterial, double binCapacity, String binColor, boolean hasLid, 
                   boolean isRecyclable, String binShape, boolean hasFootPedal, String usageArea, 
                   boolean isSmartBin, String manufacturer, String countryOfOrigin, double binPrice, 
                   int warrantyYears, double binWeight, boolean isOdorControl, boolean hasPartition, 
                   String openingMechanism, int manufacturingYear, boolean isFireResistant) {

        this.binType = binType;
        this.binMaterial = binMaterial;
        this.binCapacity = binCapacity;
        this.binColor = binColor;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.binShape = binShape;
        this.hasFootPedal = hasFootPedal;
        this.usageArea = usageArea;
        this.isSmartBin = isSmartBin;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.binPrice = binPrice;
        this.warrantyYears = warrantyYears;
        this.binWeight = binWeight;
        this.isOdorControl = isOdorControl;
        this.hasPartition = hasPartition;
        this.openingMechanism = openingMechanism;
        this.manufacturingYear = manufacturingYear;
        this.isFireResistant = isFireResistant;
    }
}