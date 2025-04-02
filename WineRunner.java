class WineRunner {
    public static void main(String[] args) {
        Wine wine1 = new Wine();
        wine1.info();

        Wine wine2 = new Wine(5);
        wine2.info();

        Wine wine3 = new Wine(5, 250.5);
        wine3.info();

        Wine wine4 = new Wine(5, 250.5, "France");
        wine4.info();

        Wine wine5 = new Wine(5, 250.5, "France", "Red");
        wine5.info();

        Wine wine6 = new Wine(5, 250.5, "France", "Red", "Fruity");
        wine6.info();

        Wine wine7 = new Wine(5, 250.5, "France", "Red", "Fruity", true);
        wine7.info();

        Wine wine8 = new Wine(5, 250.5, "France", "Red", "Fruity", true, false);
        wine8.info();

        Wine wine9 = new Wine(5, 250.5, "France", "Red", "Fruity", true, false, "Chateau");
        wine9.info();

        Wine wine10 = new Wine(5, 250.5, "France", "Red", "Fruity", true, false, "Chateau", 50);
        wine10.info();

        Wine wine11 = new Wine(5, 250.5, "France", "Red", "Fruity", true, false, "Chateau", 50, 1998);
        wine11.info();
    }
}