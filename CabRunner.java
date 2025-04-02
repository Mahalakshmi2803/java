class CabRunner {
    public static void main(String[] args) {

        Cab cab1 = new Cab("Sedan", "Toyota Camry", "White", 4, 12.50, true, "Petrol", 18.0, 
                           "Automatic", false, "Uber", "Japan", 2022, true, false, false, 
                           500.0, 5, false, false);

        
        System.out.println("Cab Model: " + cab1.cabModel);
        System.out.println("Cab Color: " + cab1.cabColor);
        System.out.println("Seating Capacity: " + cab1.seatingCapacity);
        System.out.println("Fare per Km: " + cab1.farePerKm);
        System.out.println("Is AC Available: " + cab1.isACAvailable);
        System.out.println("Fuel Type: " + cab1.fuelType);
        System.out.println("Mileage: " + cab1.mileage);
        System.out.println("Transmission Type: " + cab1.transmissionType);
        System.out.println("Is Electric: " + cab1.isElectric);
        System.out.println("Cab Company: " + cab1.cabCompany);
        System.out.println("Country of Origin: " + cab1.countryOfOrigin);
        System.out.println("Manufacturing Year: " + cab1.manufacturingYear);
        System.out.println("Has GPS: " + cab1.hasGPS);
        System.out.println("Has WiFi: " + cab1.hasWiFi);
        System.out.println("Is Luxury: " + cab1.isLuxury);
        System.out.println("Trunk Capacity: " + cab1.trunkCapacity);
        System.out.println("Safety Rating: " + cab1.safetyRating );
        System.out.println("Has Sunroof: " + cab1.hasSunroof);
        System.out.println("Has Entertainment System: " + cab1.hasEntertainmentSystem);

        Cab cab2 = new Cab("SUV", "Ford Explorer", "Black", 6, 15.00, true, "Diesel", 12.0, 
                           "Manual", false, "Lyft", "USA", 2023, true, true, true, 
                           700.0, 5, true, true);

       
        System.out.println("Cab Model: " + cab2.cabModel);
        System.out.println("Cab Color: " + cab2.cabColor);
        System.out.println("Seating Capacity: " + cab2.seatingCapacity);
        System.out.println("Fare per Km: " + cab2.farePerKm);
        System.out.println("Is AC Available: " + cab2.isACAvailable);
        System.out.println("Fuel Type: " + cab2.fuelType);
        System.out.println("Mileage: " + cab2.mileage);
        System.out.println("Transmission Type: " + cab2.transmissionType);
        System.out.println("Is Electric: " + cab2.isElectric);
        System.out.println("Cab Company: " + cab2.cabCompany);
        System.out.println("Country of Origin: " + cab2.countryOfOrigin);
        System.out.println("Manufacturing Year: " + cab2.manufacturingYear);
        System.out.println("Has GPS: " + cab2.hasGPS);
        System.out.println("Has WiFi: " + cab2.hasWiFi);
        System.out.println("Is Luxury: " + cab2.isLuxury);
        System.out.println("Trunk Capacity: " + cab2.trunkCapacity);
        System.out.println("Safety Rating: " + cab2.safetyRating);
        System.out.println("Has Sunroof: " + cab2.hasSunroof);
        System.out.println("Has Entertainment System: " + cab2.hasEntertainmentSystem);

        Cab cab3 = new Cab("Electric", "Tesla Model S", "Red", 4, 20.00, true, "Electric", 400.0, 
                           "Automatic", true, "Tesla Cabs", "USA", 2024, true, true, true, 
                           600.0, 5, true, true);

    
        System.out.println("Cab Model: " + cab3.cabModel);
        System.out.println("Cab Color: " + cab3.cabColor);
        System.out.println("Seating Capacity: " + cab3.seatingCapacity);
        System.out.println("Fare per Km: " + cab3.farePerKm);
        System.out.println("Is AC Available: " + cab3.isACAvailable);
        System.out.println("Fuel Type: " + cab3.fuelType);
        System.out.println("Mileage: " + cab3.mileage );
        System.out.println("Transmission Type: " + cab3.transmissionType);
        System.out.println("Is Electric: " + cab3.isElectric);
        System.out.println("Cab Company: " + cab3.cabCompany);
        System.out.println("Country of Origin: " + cab3.countryOfOrigin);
        System.out.println("Manufacturing Year: " + cab3.manufacturingYear);
        System.out.println("Has GPS: " + cab3.hasGPS);
        System.out.println("Has WiFi: " + cab3.hasWiFi);
        System.out.println("Is Luxury: " + cab3.isLuxury);
        System.out.println("Trunk Capacity: " + cab3.trunkCapacity );
        System.out.println("Safety Rating: " + cab3.safetyRating );
        System.out.println("Has Sunroof: " + cab3.hasSunroof);
        System.out.println("Has Entertainment System: " + cab3.hasEntertainmentSystem);
    }
}