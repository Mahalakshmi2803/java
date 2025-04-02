class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond1 = new Diamond();
        diamond1.info();

        Diamond diamond2 = new Diamond(2);
        diamond2.info();

        Diamond diamond3 = new Diamond(2, 5000.75);
        diamond3.info();

        Diamond diamond4 = new Diamond(2, 5000.75, "Brilliant");
        diamond4.info();

        Diamond diamond5 = new Diamond(2, 5000.75, "Brilliant", "White");
        diamond5.info();

        Diamond diamond6 = new Diamond(2, 5000.75, "Brilliant", "White", 9.5f);
        diamond6.info();

        Diamond diamond7 = new Diamond(2, 5000.75, "Brilliant", "White", 9.5f, true);
        diamond7.info();

        Diamond diamond8 = new Diamond(2, 5000.75, "Brilliant", "White", 9.5f, true, true);
        diamond8.info();

        Diamond diamond9 = new Diamond(2, 5000.75, "Brilliant", "White", 9.5f, true, true, "A");
        diamond9.info();

        Diamond diamond10 = new Diamond(2, 5000.75, "Brilliant", "White", 9.5f, true, true, "A", 123456789);
        diamond10.info();

        Diamond diamond11 = new Diamond(2, 5000.75, "Brilliant", "White", 9.5f, true, true, "A", 123456789,  5);
        diamond11.info();
    }
}