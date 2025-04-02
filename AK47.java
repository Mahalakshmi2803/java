class AK47 {

    String model;
    String country;
    int range;
    int magazineCapacity;
    int weight;
    boolean isAutomatic;
    boolean isReliable;
    String caliber;
    int fireRate;
    int productionYear;

    public AK47() {
        System.out.println("AK47 Details:");
    }

    public AK47(String model) {
        this.model = model;
    }

    public AK47(String model, String country) {
        this(model);
        this.country = country;
    }

    public AK47(String model, String country, int range) {
        this(model, country);
        this.range = range;
    }

    public AK47(String model, String country, int range, int magazineCapacity) {
        this(model, country, range);
        this.magazineCapacity = magazineCapacity;
    }

    public AK47(String model, String country, int range, int magazineCapacity, int weight) {
        this(model, country, range, magazineCapacity);
        this.weight = weight;
    }

    public AK47(String model, String country, int range, int magazineCapacity, int weight, boolean isAutomatic) {
        this(model, country, range, magazineCapacity, weight);
        this.isAutomatic = isAutomatic;
    }

    public AK47(String model, String country, int range, int magazineCapacity, int weight, boolean isAutomatic, boolean isReliable) {
        this(model, country, range, magazineCapacity, weight, isAutomatic);
        this.isReliable = isReliable;
    }

    public AK47(String model, String country, int range, int magazineCapacity, int weight, boolean isAutomatic, boolean isReliable, String caliber) {
        this(model, country, range, magazineCapacity, weight, isAutomatic, isReliable);
        this.caliber = caliber;
    }

    public AK47(String model, String country, int range, int magazineCapacity, int weight, boolean isAutomatic, boolean isReliable, String caliber, int fireRate) {
        this(model, country, range, magazineCapacity, weight, isAutomatic, isReliable, caliber);
        this.fireRate = fireRate;
    }

    public AK47(String model, String country, int range, int magazineCapacity, int weight, boolean isAutomatic, boolean isReliable, String caliber, int fireRate, int productionYear) {
        this(model, country, range, magazineCapacity, weight, isAutomatic, isReliable, caliber, fireRate);
        this.productionYear = productionYear;
    }

    public void info() {
        System.out.println("AK47 Model: " + this.model);
        System.out.println("Manufactured In: " + this.country);
        System.out.println("Effective Range: " + this.range);
        System.out.println("Magazine Capacity: " + this.magazineCapacity);
        System.out.println("Weight: " + this.weight);
        System.out.println("Automatic: " + this.isAutomatic);
        System.out.println("Reliable: " + this.isReliable);
        System.out.println("Caliber: " + this.caliber);
        System.out.println("Fire Rate: " + this.fireRate);
        System.out.println("Production Year: " + this.productionYear);
    }
}


