class Granite {

    String type;
    int weight;
    String color;
    String brand;
    String material;
    boolean polished;
    boolean heatResistant;
    boolean waterproof;
    int cost;
    double thickness;

    public Granite() {
        System.out.println("Granite Details:");
    }

    public Granite(String type) {
        this.type = type;
    }

    public Granite(String type, int weight) {
        this(type);
        this.weight = weight;
    }

    public Granite(String type, int weight, String color) {
        this(type, weight);
        this.color = color;
    }

    public Granite(String type, int weight, String color, String brand) {
        this(type, weight, color);
        this.brand = brand;
    }

    public Granite(String type, int weight, String color, String brand, String material) {
        this(type, weight, color, brand);
        this.material = material;
    }

    public Granite(String type, int weight, String color, String brand, String material, boolean polished) {
        this(type, weight, color, brand, material);
        this.polished = polished;
    }

    public Granite(String type, int weight, String color, String brand, String material, boolean polished, boolean heatResistant) {
        this(type, weight, color, brand, material, polished);
        this.heatResistant = heatResistant;
    }

    public Granite(String type, int weight, String color, String brand, String material, boolean polished, boolean heatResistant, boolean waterproof) {
        this(type, weight, color, brand, material, polished, heatResistant);
        this.waterproof = waterproof;
    }

    public Granite(String type, int weight, String color, String brand, String material, boolean polished, boolean heatResistant, boolean waterproof, int cost) {
        this(type, weight, color, brand, material, polished, heatResistant, waterproof);
        this.cost = cost;
    }

    public Granite(String type, int weight, String color, String brand, String material, boolean polished, boolean heatResistant, boolean waterproof, int cost, double thickness) {
        this(type, weight, color, brand, material, polished, heatResistant, waterproof, cost);
        this.thickness = thickness;
    }

    public void info() {
        System.out.println("Granite type: " + this.type);
        System.out.println("Granite weight: " + this.weight);
        System.out.println("Granite color: " + this.color);
        System.out.println("Granite brand: " + this.brand);
        System.out.println("Granite material: " + this.material);
        System.out.println("Granite polished: " + this.polished);
        System.out.println("Granite heat-resistant: " + this.heatResistant);
        System.out.println("Granite waterproof: " + this.waterproof);
        System.out.println("Granite cost: " + this.cost);
        System.out.println("Granite thickness: " + this.thickness);
    }
}


