class Wine {

    int age;
    double price;
    String region;
    String type;
    String flavor;
    boolean tasteIsGood;
	boolean fizzy;
    String brand;
    int bottles;
    int vintageYear;

    public Wine() {
        System.out.println("Wine Details:");
    }

    public Wine(int age) {
        this.age = age;
    }

    public Wine(int age, double price) {
        this(age);
        this.price = price;
    }

    public Wine(int age, double price, String region) {
        this(age, price);
        this.region = region;
    }

    public Wine(int age, double price, String region, String type) {
        this(age, price, region);
        this.type = type;
    }

    public Wine(int age, double price, String region, String type, String flavor) {
        this(age, price, region, type);
        this.flavor = flavor;
    }

    public Wine(int age, double price, String region, String type, String flavor, boolean tasteIsGood) {
        this(age, price, region, type, flavor);
        this.tasteIsGood = tasteIsGood;
    }

    public Wine(int age, double price, String region, String type, String flavor, boolean tasteIsGood, boolean fizzy) {
        this(age, price, region, type, flavor, tasteIsGood);
        this.fizzy = fizzy;
    }

    public Wine(int age, double price, String region, String type, String flavor, boolean tasteIsGood, boolean fizzy, String brand) {
        this(age, price, region, type, flavor, tasteIsGood, fizzy);
        this.brand = brand;
    }

    public Wine(int age, double price, String region, String type, String flavor, boolean tasteIsGood, boolean fizzy, String brand, int bottles) {
        this(age, price, region, type, flavor, tasteIsGood, fizzy, brand);
        this.bottles = bottles;
    }

    public Wine(int age, double price, String region, String type, String flavor, boolean tasteIsGood, boolean fizzy, String brand, int bottles, int vintageYear) {
        this(age, price, region, type, flavor, tasteIsGood, fizzy, brand, bottles);
        this.vintageYear = vintageYear;
    }

    public void info() {
        System.out.println("Wine Age: " + this.age);
        System.out.println("Wine Price: " + this.price);
        System.out.println("Wine Region: " + this.region);
        System.out.println("Wine Type: " + this.type);
        System.out.println("Wine Flavor: " + this.flavor);
        System.out.println("Wine Taste is Good: " + this.tasteIsGood);
        System.out.println("Wine Fizzy: " + this.fizzy);
        System.out.println("Wine Brand: " + this.brand);
        System.out.println("Wine Bottles: " + this.bottles);
        System.out.println("Wine Vintage Year: " + this.vintageYear);
    }
}


