class CementRunner {
    public static void main(String[] args) {
        Cement cement1 = new Cement();
        cement1.info();

        Cement cement2 = new Cement(2);
        cement2.info();

        Cement cement3 = new Cement(2, 5000.75);
        cement3.info();

        Cement cement4 = new Cement(2, 5000.75, "Portland");
        cement4.info();

        Cement cement5 = new Cement(2, 5000.75, "Portland", "Gray");
        cement5.info();

        Cement cement6 = new Cement(2, 5000.75, "Portland", "Gray", 9.5f);
        cement6.info();

        Cement cement7 = new Cement(2, 5000.75, "Portland", "Gray", 9.5f, true);
        cement7.info();

        Cement cement8 = new Cement(2, 5000.75, "Portland", "Gray", 9.5f, true, true);
        cement8.info();

        Cement cement9 = new Cement(2, 5000.75, "Portland", "Gray", 9.5f, true, true, "Strength");
        cement9.info();

        Cement cement10 = new Cement(2, 5000.75, "Portland", "Gray", 9.5f, true, true, "Strength", 123456);
        cement10.info();

        Cement cement11 = new Cement(2, 5000.75, "Portland", "Gray", 9.5f, true, true, "Strength", 123456, 5);
        cement11.info();
    }
}