class Engine {
    
    static void displayInfo(String model, String manufacturer, String type, int horsepower, int torque, int displacement,
                            int cylinders, String fuelType, double compressionRatio, String coolingSystem, double boreSize,
                            double stroke, String ignitionSystem, double weight, int maxRPM, double fuelEfficiency,
                            String emissionStandard, boolean turbocharged, String fuelInjection, String transmissionType,
                            String starterType, int warranty, double price, int productionYear, String countryOfOrigin) {
        
        System.out.println("\nModel: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Type: " + type);
        System.out.println("Horsepower: " + horsepower + " HP");
        System.out.println("Torque: " + torque + " Nm");
        System.out.println("Displacement: " + displacement + " cc");
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Compression Ratio: " + compressionRatio);
        System.out.println("Cooling System: " + coolingSystem);
        System.out.println("Bore Size: " + boreSize + " mm");
        System.out.println("Stroke: " + stroke + " mm");
        System.out.println("Ignition System: " + ignitionSystem);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Max RPM: " + maxRPM);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
        System.out.println("Emission Standard: " + emissionStandard);
        System.out.println("Turbocharged: " + (turbocharged ? "Yes" : "No"));
        System.out.println("Fuel Injection: " + fuelInjection);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Starter Type: " + starterType);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Price: $" + price);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Country of Origin: " + countryOfOrigin);
    }
}
