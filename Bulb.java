class Bulb {

    int wattage;
    double price;
    String brand;
    String type;
    String color;
    boolean energyEfficient;
    boolean goodQuality;
    int lifespan;
    int quantity;

    public Bulb() {
        System.out.println("Bulb Details:");
    }

    public Bulb(int wattage) {
        this.wattage = wattage;
    }

    public Bulb(int wattage, double price) {
        this(wattage);
        this.price = price;
    }

    public Bulb(int wattage, double price, String brand) {
        this(wattage, price);
        this.brand = brand;
    }

    public Bulb(int wattage, double price, String brand, String type) {
        this(wattage, price, brand);
        this.type = type;
    }

    public Bulb(int wattage, double price, String brand, String type, String color) {
        this(wattage, price, brand, type);
        this.color = color;
    }

    public Bulb(int wattage, double price, String brand, String type, String color, boolean energyEfficient) {
        this(wattage, price, brand, type, color);
        this.energyEfficient = energyEfficient;
    }

    public Bulb(int wattage, double price, String brand, String type, String color, boolean energyEfficient, boolean goodQuality) {
        this(wattage, price, brand, type, color, energyEfficient);
        this.goodQuality = goodQuality;
    }

    public Bulb(int wattage, double price, String brand, String type, String color, boolean energyEfficient, boolean goodQuality, int lifespan) {
        this(wattage, price, brand, type, color, energyEfficient, goodQuality);
        this.lifespan = lifespan;
    }

    public Bulb(int wattage, double price, String brand, String type, String color, boolean energyEfficient, boolean goodQuality, int lifespan, int quantity) {
        this(wattage, price, brand, type, color, energyEfficient, goodQuality, lifespan);
        this.quantity = quantity;
    }

    public void info() {
        System.out.println("Bulb Wattage: " + this.wattage);
        System.out.println("Bulb Price: " + this.price);
        System.out.println("Bulb Brand: " + this.brand);
        System.out.println("Bulb Type: " + this.type);
        System.out.println("Bulb Color: " + this.color);
        System.out.println("Bulb Energy Efficient: " + this.energyEfficient);
        System.out.println("Bulb Dimmable: " + this.goodQuality);
        System.out.println("Bulb Lifespan: " + this.lifespan);
        System.out.println("Bulb Quantity: " + this.quantity);
    }
}


