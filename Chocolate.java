class Chocolate {
    
    String chocolateName;
    String chocolateType;
    double chocolateWeight;
    String chocolateBrand;
    boolean isSugarFree;
    boolean isDarkChocolate;
    String mainIngredient;
    boolean hasNuts;
    String packagingType;
    boolean isOrganic;
    String manufacturer;
    String countryOfOrigin;
    double chocolatePrice;
    int shelfLifeInMonths;
    double cocoaPercentage;
    boolean isGlutenFree;
    boolean hasCaramelFilling;
    String chocolateShape;
    int manufacturingYear;
    boolean isVegan;

    public Chocolate(String chocolateName, String chocolateType, double chocolateWeight, String chocolateBrand, 
                     boolean isSugarFree, boolean isDarkChocolate, String mainIngredient, boolean hasNuts, 
                     String packagingType, boolean isOrganic, String manufacturer, String countryOfOrigin, 
                     double chocolatePrice, int shelfLifeInMonths, double cocoaPercentage, boolean isGlutenFree, 
                     boolean hasCaramelFilling, String chocolateShape, int manufacturingYear, boolean isVegan) {

        this.chocolateName = chocolateName;
        this.chocolateType = chocolateType;
        this.chocolateWeight = chocolateWeight;
        this.chocolateBrand = chocolateBrand;
        this.isSugarFree = isSugarFree;
        this.isDarkChocolate = isDarkChocolate;
        this.mainIngredient = mainIngredient;
        this.hasNuts = hasNuts;
        this.packagingType = packagingType;
        this.isOrganic = isOrganic;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.chocolatePrice = chocolatePrice;
        this.shelfLifeInMonths = shelfLifeInMonths;
        this.cocoaPercentage = cocoaPercentage;
        this.isGlutenFree = isGlutenFree;
        this.hasCaramelFilling = hasCaramelFilling;
        this.chocolateShape = chocolateShape;
        this.manufacturingYear = manufacturingYear;
        this.isVegan = isVegan;
    }
}

