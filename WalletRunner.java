class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        wallet1.info();

        Wallet wallet2 = new Wallet(3);
        wallet2.info();

        Wallet wallet3 = new Wallet(3, 1999.99);
        wallet3.info();

        Wallet wallet4 = new Wallet(3, 1999.99, "Leather");
        wallet4.info();

        Wallet wallet5 = new Wallet(3, 1999.99, "Leather", "Black");
        wallet5.info();

        Wallet wallet6 = new Wallet(3, 1999.99, "Leather", "Black", 0.5f);
        wallet6.info();

        Wallet wallet7 = new Wallet(3, 1999.99, "Leather", "Black", 0.5f, true);
        wallet7.info();

        Wallet wallet8 = new Wallet(3, 1999.99, "Leather", "Black", 0.5f, true, true);
        wallet8.info();

        Wallet wallet9 = new Wallet(3, 1999.99, "Leather", "Black", 0.5f, true, true, "Fossil");
        wallet9.info();

        Wallet wallet10 = new Wallet(3, 1999.99, "Leather", "Black", 0.5f, true, true, "Fossil", 987654);
        wallet10.info();

        Wallet wallet11 = new Wallet(3, 1999.99, "Leather", "Black", 0.5f, true, true, "Fossil", 987654, 2);
        wallet11.info();
    }
}