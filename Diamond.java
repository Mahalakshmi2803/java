class Diamond {

    int carat;
    double price;
    String type;
    String color;
    float clarity;
    boolean isNatural;
    boolean isCertified;
    String quality;
    int id;
    int warrantyYears;

    public Diamond() {
        System.out.println("Diamond Details:");
    }

    public Diamond(int carat) {
        this.carat = carat;
    }

    public Diamond(int carat, double price) {
        this(carat);
        this.price = price;
    }

    public Diamond(int carat, double price, String type) {
        this(carat, price);
        this.type = type;
    }

    public Diamond(int carat, double price, String type, String color) {
        this(carat, price, type);
        this.color = color;
    }

    public Diamond(int carat, double price, String type, String color, float clarity) {
        this(carat, price, type, color);
        this.clarity = clarity;
    }

    public Diamond(int carat, double price, String type, String color, float clarity, boolean isNatural) {
        this(carat, price, type, color, clarity);
        this.isNatural = isNatural;
    }

    public Diamond(int carat, double price, String type, String color, float clarity, boolean isNatural, boolean isCertified) {
        this(carat, price, type, color, clarity, isNatural);
        this.isCertified = isCertified;
    }

    public Diamond(int carat, double price, String type, String color, float clarity, boolean isNatural, boolean isCertified, String quality) {
        this(carat, price, type, color, clarity, isNatural, isCertified);
        this.quality = quality;
    }

    public Diamond(int carat, double price, String type, String color, float clarity, boolean isNatural, boolean isCertified, String quality, int id) {
        this(carat, price, type, color, clarity, isNatural, isCertified, quality);
        this.id = id;
    }

    public Diamond(int carat, double price, String type, String color, float clarity, boolean isNatural, boolean isCertified, String quality, int id, int warrantyYears) {
        this(carat, price, type, color, clarity, isNatural, isCertified, quality, id);
        this.warrantyYears = warrantyYears;
    }

    public void info() {
        System.out.println("Diamond Carat: " + this.carat);
        System.out.println("Diamond Price: " + this.price);
        System.out.println("Diamond Type: " + this.type);
        System.out.println("Diamond Color: " + this.color);
        System.out.println("Diamond Clarity: " + this.clarity);
        System.out.println("Diamond is Natural: " + this.isNatural);
        System.out.println("Diamond is Certified: " + this.isCertified);
        System.out.println("Diamond Quality: " + this.quality);
        System.out.println("Diamond Serial Number: " + this.id);
        System.out.println("Diamond Warranty Years: " + this.warrantyYears);
    }
}


