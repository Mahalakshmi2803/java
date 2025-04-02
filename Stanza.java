class Stanza {

    String type;
    String area;
    int rent;
    int noOfFloors;
    int number;
    boolean isCoLive;
    boolean goodFood;
    String service;
    int ratingOutOf5;
    int openHours;

    public Stanza() {
        System.out.println("Stanza Details:");
    }

    public Stanza(String type) {
        this.type = type;
    }

    public Stanza(String type, String area) {
        this(type);
        this.area = area;
    }

    public Stanza(String type, String area, int rent) {
        this(type, area);
        this.rent = rent;
    }

    public Stanza(String type, String area, int rent, int noOfFloors) {
        this(type, area, rent);
        this.noOfFloors = noOfFloors;
    }

    public Stanza(String type, String area, int rent, int noOfFloors, int number) {
        this(type, area, rent, noOfFloors);
        this.number = number;
    }

    public Stanza(String type, String area, int rent, int noOfFloors, int number, boolean isCoLive) {
        this(type, area, rent, noOfFloors, number);
        this.isCoLive = isCoLive;
    }

    public Stanza(String type, String area, int rent, int noOfFloors, int number, boolean isCoLive, boolean goodFood) {
        this(type, area, rent, noOfFloors, number, isCoLive);
        this.goodFood = goodFood;
    }

    public Stanza(String type, String area, int rent, int noOfFloors, int number, boolean isCoLive, boolean goodFood, String service) {
        this(type, area, rent, noOfFloors, number, isCoLive, goodFood);
        this.service = service;
    }

    public Stanza(String type, String area, int rent, int noOfFloors, int number, boolean isCoLive, boolean goodFood, String service, int ratingOutOf5) {
        this(type, area, rent, noOfFloors, number, isCoLive, goodFood, service);
        this.ratingOutOf5 = ratingOutOf5;
    }

    public Stanza(String type, String area, int rent, int noOfFloors, int number, boolean isCoLive, boolean goodFood, String service, int ratingOutOf5, int openHours) {
        this(type, area, rent, noOfFloors, number, isCoLive, goodFood, service, ratingOutOf5);
        this.openHours = openHours;
    }

    public void info() {
        System.out.println("Stanza Type: " + this.type);
        System.out.println("Stanza Area: " + this.area);
        System.out.println("Stanza Rent: " + this.rent);
        System.out.println("Stanza No. of Floors: " + this.noOfFloors);
        System.out.println("Stanza Number: " + this.number);
        System.out.println("Stanza Co-Living: " + this.isCoLive);
        System.out.println("Stanza Good Food: " + this.goodFood);
        System.out.println("Stanza Service: " + this.service);
        System.out.println("Stanza Rating: " + this.ratingOutOf5);
        System.out.println("Stanza Open Hours: " + this.openHours);
    }
}


