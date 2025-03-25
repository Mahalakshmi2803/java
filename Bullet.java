class Bullet {
    
    static void displayInfo(String caliber, String type, double weight, double velocity, double price) {
        System.out.println("\nCaliber: " + caliber);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Velocity: " + velocity + " m/s");
        System.out.println("Price per Round: $" + price);
    }
}
