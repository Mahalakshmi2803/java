class Army {

    int soldiers;
    double budget;
    String country;
    String division;
    String power;
    boolean active;
    boolean reserve;
    String general;
    int regiments;
    int serviceYears;

    public Army() {
        System.out.println("Army Details:");
    }

    public Army(int soldiers) {
        this.soldiers = soldiers;
    }

    public Army(int soldiers, double budget) {
        this(soldiers);
        this.budget = budget;
    }

    public Army(int soldiers, double budget, String country) {
        this(soldiers, budget);
        this.country = country;
    }

    public Army(int soldiers, double budget, String country, String division) {
        this(soldiers, budget, country);
        this.division = division;
    }

    public Army(int soldiers, double budget, String country, String division, String power) {
        this(soldiers, budget, country, division);
        this.power = power;
    }

    public Army(int soldiers, double budget, String country, String division, String power, boolean active) {
        this(soldiers, budget, country, division, power);
        this.active = active;
    }

    public Army(int soldiers, double budget, String country, String division, String power, boolean active, boolean reserve) {
        this(soldiers, budget, country, division, power, active);
        this.reserve = reserve;
    }

    public Army(int soldiers, double budget, String country, String division, String power, boolean active, boolean reserve, String general) {
        this(soldiers, budget, country, division, power, active, reserve);
        this.general = general;
    }

    public Army(int soldiers, double budget, String country, String division, String power, boolean active, boolean reserve, String general, int regiments) {
        this(soldiers, budget, country, division, power, active, reserve, general);
        this.regiments = regiments;
    }

    public Army(int soldiers, double budget, String country, String division, String power, boolean active, boolean reserve, String general, int regiments, int serviceYears) {
        this(soldiers, budget, country, division, power, active, reserve, general, regiments);
        this.serviceYears = serviceYears;
    }

    public void info() {
        System.out.println("Army Soldiers: " + this.soldiers);
        System.out.println("Army Budget: " + this.budget);
        System.out.println("Army Country: " + this.country);
        System.out.println("Army Division: " + this.division);
        System.out.println("Army Power: " + this.power);
        System.out.println("Army Active: " + this.active);
        System.out.println("Army Reserve: " + this.reserve);
        System.out.println("Army General: " + this.general);
        System.out.println("Army Regiments: " + this.regiments);
        System.out.println("Army Service Years: " + this.serviceYears);
    }
}


