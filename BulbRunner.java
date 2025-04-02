class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        bulb1.info();

        Bulb bulb2 = new Bulb(60);
        bulb2.info();

        Bulb bulb3 = new Bulb(60, 5.99);
        bulb3.info();

        Bulb bulb4 = new Bulb(60, 5.99, "Philips");
        bulb4.info();

        Bulb bulb5 = new Bulb(60, 5.99, "Philips", "LED");
        bulb5.info();

        Bulb bulb6 = new Bulb(60, 5.99, "Philips", "LED", "Warm White");
        bulb6.info();

        Bulb bulb7 = new Bulb(60, 5.99, "Philips", "LED", "Warm White", true);
        bulb7.info();

        Bulb bulb8 = new Bulb(60, 5.99, "Philips", "LED", "Warm White", true, false);
        bulb8.info();

        Bulb bulb9 = new Bulb(60, 5.99, "Philips", "LED", "Warm White", true, false, 25000);
        bulb9.info();

        Bulb bulb10 = new Bulb(60, 5.99, "Philips", "LED", "Warm White", true, false, 25000, 4);
        bulb10.info();
    }
}