class ArmyRunner {
    public static void main(String[] args) {
        Army army1 = new Army();
        army1.info();

        Army army2 = new Army(500000);
        army2.info();

        Army army3 = new Army(500000, 700.5);
        army3.info();

        Army army4 = new Army(500000, 700.5, "USA");
        army4.info();

        Army army5 = new Army(500000, 700.5, "USA", "Infantry");
        army5.info();

        Army army6 = new Army(500000, 700.5, "USA", "Infantry","Might");
        army6.info();

        Army army7 = new Army(500000, 700.5, "USA", "Infantry", "Might", true);
        army7.info();

        Army army8 = new Army(500000, 700.5, "USA", "Infantry", "Might", true, true);
        army8.info();

        Army army9 = new Army(500000, 700.5, "USA", "Infantry", "Might", true, true, "General Smith");
        army9.info();

        Army army10 = new Army(500000, 700.5, "USA", "Infantry", "Might", true, true, "General Smith", 10);
        army10.info();

        Army army11 = new Army(500000, 700.5, "USA", "Infantry", "Might", true, true, "General Smith", 10, 20);
        army11.info();
    }
}