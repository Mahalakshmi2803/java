class EngineRunner {
    public static void main(String[] args) {
        
        Engine.displayInfo("V8 Turbo", "Ford", "Petrol", 500, 650, 5000, 8, "Gasoline", 10.5, "Liquid Cooling",
                           92.0, 92.7, "Electronic", 220, 7000, 12.0, "Euro 6", true, "Direct Injection",
                           "Automatic", "Electric", 5, 25000, 2023, "USA");

        Engine.displayInfo("Twin Turbo V6", "BMW", "Petrol", 450, 600, 3000, 6, "Gasoline", 10.0, "Water Cooling",
                           89.0, 90.3, "Electronic", 210, 7500, 14.5, "Euro 6", true, "Sequential Fuel Injection",
                           "Manual", "Electric", 4, 32000, 2022, "Germany");

        Engine.displayInfo("Straight-4 Turbo", "Toyota", "Diesel", 190, 400, 2500, 4, "Diesel", 18.5, "Air Cooling",
                           85.0, 86.5, "Electronic", 180, 5500, 18.0, "BS6", true, "Common Rail Injection",
                           "CVT", "Electric", 6, 18000, 2024, "Japan");

        Engine.displayInfo("Electric Drive Unit", "Tesla", "Electric", 600, 700, 0, 0, "Electric", 0, "Liquid Cooling",
                           0, 0, "None", 150, 18000, 0, "Zero Emission", false, "None",
                           "Single-Speed", "Push Button", 8, 50000, 2025, "USA");

        Engine.displayInfo("Boxer-6 Turbo", "Porsche", "Petrol", 420, 500, 3800, 6, "Gasoline", 11.2, "Liquid Cooling",
                           102.0, 77.5, "Electronic", 205, 7800, 10.0, "Euro 6", true, "Port Injection",
                           "Automatic", "Electric", 3, 75000, 2021, "Germany");
	}
}