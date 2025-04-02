class Wallet {

    int slots;
    double price;
    String material;
    String color;
    float weight;
    boolean waterResistant;
    boolean secure;
    String brand;
    int model;
    int warranty;

    public Wallet() {
        System.out.println("Wallet Details:");
    }

    public Wallet(int slots) {
        this.slots = slots;
    }

    public Wallet(int slots, double price) {
        this(slots);
        this.price = price;
    }

    public Wallet(int slots, double price, String material) {
        this(slots, price);
        this.material = material;
    }

    public Wallet(int slots, double price, String material, String color) {
        this(slots, price, material);
        this.color = color;
    }

    public Wallet(int slots, double price, String material, String color, float weight) {
        this(slots, price, material, color);
        this.weight = weight;
    }

    public Wallet(int slots, double price, String material, String color, float weight, boolean waterResistant) {
        this(slots, price, material, color, weight);
        this.waterResistant = waterResistant;
    }

    public Wallet(int slots, double price, String material, String color, float weight, boolean waterResistant, boolean secure) {
        this(slots, price, material, color, weight, waterResistant);
        this.secure = secure;
    }

    public Wallet(int slots, double price, String material, String color, float weight, boolean waterResistant, boolean secure, String brand) {
        this(slots, price, material, color, weight, waterResistant, secure);
        this.brand = brand;
    }

    public Wallet(int slots, double price, String material, String color, float weight, boolean waterResistant, boolean secure, String brand, int model) {
        this(slots, price, material, color, weight, waterResistant, secure, brand);
        this.model = model;
    }

    public Wallet(int slots, double price, String material, String color, float weight, boolean waterResistant, boolean secure, String brand, int model, int warranty) {
        this(slots, price, material, color, weight, waterResistant, secure, brand, model);
        this.warranty = warranty;
    }

    public void info() {
        System.out.println("Wallet Slots: " + this.slots);
        System.out.println("Wallet Price: " + this.price);
        System.out.println("Wallet Material: " + this.material);
        System.out.println("Wallet Color: " + this.color);
        System.out.println("Wallet Weight: " + this.weight);
        System.out.println("Wallet Water Resistant: " + this.waterResistant);
        System.out.println("Wallet Secure: " + this.secure);
        System.out.println("Wallet Brand: " + this.brand);
        System.out.println("Wallet Model: " + this.model);
        System.out.println("Wallet Warranty: " + this.warranty);
    }
}


