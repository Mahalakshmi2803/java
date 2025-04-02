class AK47Runner {
    public static void main(String[] args) {
        AK47 ak1 = new AK47();
        ak1.info();

        AK47 ak2 = new AK47("AKM");
        ak2.info();

        AK47 ak3 = new AK47("AKM", "Russia");
        ak3.info();

        AK47 ak4 = new AK47("AKM", "Russia", 400);
        ak4.info();

        AK47 ak5 = new AK47("AKM", "Russia", 400, 30);
        ak5.info();

        AK47 ak6 = new AK47("AKM", "Russia", 400, 30, 3);
        ak6.info();

        AK47 ak7 = new AK47("AKM", "Russia", 400, 30, 3, true);
        ak7.info();

        AK47 ak8 = new AK47("AKM", "Russia", 400, 30, 3, true, true);
        ak8.info();

        AK47 ak9 = new AK47("AKM", "Russia", 400, 30, 3, true, true, "7.62");
        ak9.info();

        AK47 ak10 = new AK47("AKM", "Russia", 400, 30, 3, true, true, "7.62", 600);
        ak10.info();

        AK47 ak11 = new AK47("AKM", "Russia", 400, 30, 3, true, true, "7.62", 600, 1959);
        ak11.info();
    }
}