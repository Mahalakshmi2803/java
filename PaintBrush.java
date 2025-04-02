class PaintBrush {
    
    String brushType;
    String bristleMaterial;
    double brushSize;
    String brushColor;
    boolean isWashable;
    boolean isSynthetic;
    String handleMaterial;
    boolean hasGrip;
    String usagePurpose;
    boolean isArtistBrush;
    String manufacturer;
    String countryOfOrigin;
    double brushPrice;
    int warrantyYears;
    double brushWeight;
    boolean isEcoFriendly;
    boolean hasReplaceableHead;
    String brushShape;
    int manufacturingYear;
    boolean isHeatResistant;

    public PaintBrush(String brushType, String bristleMaterial, double brushSize, String brushColor, boolean isWashable, 
                      boolean isSynthetic, String handleMaterial, boolean hasGrip, String usagePurpose, 
                      boolean isArtistBrush, String manufacturer, String countryOfOrigin, double brushPrice, 
                      int warrantyYears, double brushWeight, boolean isEcoFriendly, boolean hasReplaceableHead, 
                      String brushShape, int manufacturingYear, boolean isHeatResistant) {

        this.brushType = brushType;
        this.bristleMaterial = bristleMaterial;
        this.brushSize = brushSize;
        this.brushColor = brushColor;
        this.isWashable = isWashable;
        this.isSynthetic = isSynthetic;
        this.handleMaterial = handleMaterial;
        this.hasGrip = hasGrip;
        this.usagePurpose = usagePurpose;
        this.isArtistBrush = isArtistBrush;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.brushPrice = brushPrice;
        this.warrantyYears = warrantyYears;
        this.brushWeight = brushWeight;
        this.isEcoFriendly = isEcoFriendly;
        this.hasReplaceableHead = hasReplaceableHead;
        this.brushShape = brushShape;
        this.manufacturingYear = manufacturingYear;
        this.isHeatResistant = isHeatResistant;
    }
}

