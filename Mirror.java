class Mirror{
	
	String mirrorType;
    String mirrorMaterial;
    double mirrorWidth;
    double mirrorHeight;
    String mirrorBrand;
    boolean isFramed;
    double mirrorPrice;
    String mirrorShape;
    String mirrorColor;
    double mirrorWeight;
    int manufacturingYear;
    String frameMaterial;
    boolean isAntiFog;
    String mountingType;
    String usage;
    boolean hasLEDLights;
    String manufacturer;
    String countryOfOrigin;
    int warrantyYears;
    boolean isShatterproof;

	
	public Mirror(String mirrorType, String mirrorMaterial, double mirrorWidth, double mirrorHeight, 
                  String mirrorBrand, boolean isFramed, double mirrorPrice, String mirrorShape, 
                  String mirrorColor, double mirrorWeight, int manufacturingYear, String frameMaterial, 
                  boolean isAntiFog, String mountingType, String usage, boolean hasLEDLights, 
                  String manufacturer, String countryOfOrigin, int warrantyYears, boolean isShatterproof) {

						
		this.mirrorType = mirrorType;
        this.mirrorMaterial = mirrorMaterial;
        this.mirrorWidth = mirrorWidth;
        this.mirrorHeight = mirrorHeight;
        this.mirrorBrand = mirrorBrand;
        this.isFramed = isFramed;
        this.mirrorPrice = mirrorPrice;
        this.mirrorShape = mirrorShape;
        this.mirrorColor = mirrorColor;
        this.mirrorWeight = mirrorWeight;
        this.manufacturingYear = manufacturingYear;
        this.frameMaterial = frameMaterial;
        this.isAntiFog = isAntiFog;
        this.mountingType = mountingType;
        this.usage = usage;
        this.hasLEDLights = hasLEDLights;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyYears = warrantyYears;
        this.isShatterproof = isShatterproof;
								
						
					}
}