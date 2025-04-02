class StanzaRunner {
    public static void main(String[] args) {
        Stanza stanza1 = new Stanza();
        stanza1.info();

        Stanza stanza2 = new Stanza("Paying Guest");
        stanza2.info();

        Stanza stanza3 = new Stanza("Paying Guest", "BTM Layout");
        stanza3.info();

        Stanza stanza4 = new Stanza("Paying Guest", "BTM Layout", 15000);
        stanza4.info();

        Stanza stanza5 = new Stanza("Paying Guest", "BTM Layout", 15000, 3);
        stanza5.info();

        Stanza stanza6 = new Stanza("Paying Guest", "BTM Layout", 15000, 3, 101);
        stanza6.info();

        Stanza stanza7 = new Stanza("Paying Guest", "BTM Layout", 15000, 3, 101, true);
        stanza7.info();

        Stanza stanza8 = new Stanza("Paying Guest", "BTM Layout", 15000, 3, 101, true, true);
        stanza8.info();

        Stanza stanza9 = new Stanza("Paying Guest", "BTM Layout", 15000, 3, 101, true, true, "Room Service");
        stanza9.info();

        Stanza stanza10 = new Stanza("Paying Guest", "BTM Layout", 15000, 3, 101, true, true, "Room Service", 4);
        stanza10.info();

        Stanza stanza11 = new Stanza("Paying Guest", "BTM Layout", 15000, 3, 101, true, true, "Room Service", 4, 24);
        stanza11.info();
    }
}