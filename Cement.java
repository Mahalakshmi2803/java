class Cement {

    int grade;
    double cost;
    String category;
    String shade;
    float density;
    boolean isEcoFriendly;
    boolean isTested;
    String strength;
    int id;
    int expiryYears;

    public Cement() {
        System.out.println("Cement Details:");
    }

    public Cement(int grade) {
        this.grade = grade;
    }

    public Cement(int grade, double cost) {
        this(grade);
        this.cost = cost;
    }

    public Cement(int grade, double cost, String category) {
        this(grade, cost);
        this.category = category;
    }

    public Cement(int grade, double cost, String category, String shade) {
        this(grade, cost, category);
        this.shade = shade;
    }

    public Cement(int grade, double cost, String category, String shade, float density) {
        this(grade, cost, category, shade);
        this.density = density;
    }

    public Cement(int grade, double cost, String category, String shade, float density, boolean isEcoFriendly) {
        this(grade, cost, category, shade, density);
        this.isEcoFriendly = isEcoFriendly;
    }

    public Cement(int grade, double cost, String category, String shade, float density, boolean isEcoFriendly, boolean isTested) {
        this(grade, cost, category, shade, density, isEcoFriendly);
        this.isTested = isTested;
    }

    public Cement(int grade, double cost, String category, String shade, float density, boolean isEcoFriendly, boolean isTested, String strength) {
        this(grade, cost, category, shade, density, isEcoFriendly, isTested);
        this.strength = strength;
    }

    public Cement(int grade, double cost, String category, String shade, float density, boolean isEcoFriendly, boolean isTested, String strength, int id) {
        this(grade, cost, category, shade, density, isEcoFriendly, isTested, strength);
        this.id = id ;
    }

    public Cement(int grade, double cost, String category, String shade, float density, boolean isEcoFriendly, boolean isTested, String strength, int id, int expiryYears) {
        this(grade, cost, category, shade, density, isEcoFriendly, isTested, strength, id);
        this.expiryYears = expiryYears;
    }

    public void info() {
        System.out.println("Cement Grade: " + this.grade);
        System.out.println("Cement Cost: " + this.cost);
        System.out.println("Cement Category: " + this.category);
        System.out.println("Cement Shade: " + this.shade);
        System.out.println("Cement Density: " + this.density);
        System.out.println("Cement is Eco-Friendly: " + this.isEcoFriendly);
        System.out.println("Cement is Tested: " + this.isTested);
        System.out.println("Cement Strength: " + this.strength);
        System.out.println("Cement Id : " + this.id);
        System.out.println("Cement Expiry Years: " + this.expiryYears);
    }
}


