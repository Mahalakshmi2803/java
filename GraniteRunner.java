class GraniteRunner {
    public static void main(String[] args) {
        Granite granite1 = new Granite();
        granite1.info();

        Granite granite2 = new Granite("Countertop");
        granite2.info();

        Granite granite3 = new Granite("Countertop", 50);
        granite3.info();

        Granite granite4 = new Granite("Countertop", 50, "Black");
        granite4.info();

        Granite granite5 = new Granite("Countertop", 50, "Black", "GraniteCo");
        granite5.info();

        Granite granite6 = new Granite("Countertop", 50, "Black", "GraniteCo", "Natural Stone");
        granite6.info();

        Granite granite7 = new Granite("Countertop", 50, "Black", "GraniteCo", "Natural Stone", true);
        granite7.info();

        Granite granite8 = new Granite("Countertop", 50, "Black", "GraniteCo", "Natural Stone", true, true);
        granite8.info();

        Granite granite9 = new Granite("Countertop", 50, "Black", "GraniteCo", "Natural Stone", true, true, true);
        granite9.info();

        Granite granite10 = new Granite("Countertop", 50, "Black", "GraniteCo", "Natural Stone", true, true, true, 2500);
        granite10.info();

        Granite granite11 = new Granite("Countertop", 50, "Black", "GraniteCo", "Natural Stone", true, true, true, 2500, 2.5);
        granite11.info();
    }
}