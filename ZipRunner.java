class ZipRunner {
    public static void main(String[] args) {

        Zip zip1 = new Zip("Coil Zip", "Polyester", 20.0, "Black", true, true, "Bags", true, 
                           "YKK", "Japan", 1.99, 1, 0.05, true, false, "Plastic", 2023, true);

        System.out.println("Zip Type: " + zip1.zipType);
        System.out.println("Material: " + zip1.material);
        System.out.println("Length: " + zip1.length );
        System.out.println("Color: " + zip1.color);
        System.out.println("Is Water Resistant: " + zip1.isWaterResistant);
        System.out.println("Is Auto Lock: " + zip1.isAutoLock);
        System.out.println("Usage Area: " + zip1.usageArea);
        System.out.println("Is Eco-Friendly: " + zip1.isEcoFriendly);
        System.out.println("Manufacturer: " + zip1.manufacturer);
        System.out.println("Country of Origin: " + zip1.countryOfOrigin);
        System.out.println("Price: " + zip1.price);
        System.out.println("Warranty Years: " + zip1.warrantyYears);
        System.out.println("Weight: " + zip1.weight );
        System.out.println("Is Reusable: " + zip1.isReusable);
        System.out.println("Has Double Slider: " + zip1.hasDoubleSlider);
        System.out.println("Teeth Material: " + zip1.teethMaterial);
        System.out.println("Manufacturing Year: " + zip1.manufacturingYear);
        System.out.println("Is Rust Resistant: " + zip1.isRustResistant);

        Zip zip2 = new Zip("Metal Zip", "Brass", 25.0, "Silver", false, true, "Jackets", false, 
                           "Riri", "Switzerland", 3.99, 2, 0.08, true, true, "Metal", 2024, true);

        System.out.println("Zip Type: " + zip2.zipType);
        System.out.println("Material: " + zip2.material);
        System.out.println("Length: " + zip2.length );
        System.out.println("Color: " + zip2.color);
        System.out.println("Is Water Resistant: " + zip2.isWaterResistant);
        System.out.println("Is Auto Lock: " + zip2.isAutoLock);
        System.out.println("Usage Area: " + zip2.usageArea);
        System.out.println("Is Eco-Friendly: " + zip2.isEcoFriendly);
        System.out.println("Manufacturer: " + zip2.manufacturer);
        System.out.println("Country of Origin: " + zip2.countryOfOrigin);
        System.out.println("Price: " + zip2.price);
        System.out.println("Warranty Years: " + zip2.warrantyYears);
        System.out.println("Weight: " + zip2.weight );
        System.out.println("Is Reusable: " + zip2.isReusable);
        System.out.println("Has Double Slider: " + zip2.hasDoubleSlider);
        System.out.println("Teeth Material: " + zip2.teethMaterial);
        System.out.println("Manufacturing Year: " + zip2.manufacturingYear);
        System.out.println("Is Rust Resistant: " + zip2.isRustResistant);

        Zip zip3 = new Zip("Invisible Zip", "Nylon", 22.0, "White", false, false, "Dresses", true, 
                           "SBS", "China", 2.49, 1, 0.04, true, false, "Nylon", 2025, false);

        System.out.println("Zip Type: " + zip3.zipType);
        System.out.println("Material: " + zip3.material);
        System.out.println("Length: " + zip3.length );
        System.out.println("Color: " + zip3.color);
        System.out.println("Is Water Resistant: " + zip3.isWaterResistant);
        System.out.println("Is Auto Lock: " + zip3.isAutoLock);
        System.out.println("Usage Area: " + zip3.usageArea);
        System.out.println("Is Eco-Friendly: " + zip3.isEcoFriendly);
        System.out.println("Manufacturer: " + zip3.manufacturer);
        System.out.println("Country of Origin: " + zip3.countryOfOrigin);
        System.out.println("Price: " + zip3.price);
        System.out.println("Warranty Years: " + zip3.warrantyYears);
        System.out.println("Weight: " + zip3.weight );
        System.out.println("Is Reusable: " + zip3.isReusable);
        System.out.println("Has Double Slider: " + zip3.hasDoubleSlider);
        System.out.println("Teeth Material: " + zip3.teethMaterial);
        System.out.println("Manufacturing Year: " + zip3.manufacturingYear);
        System.out.println("Is Rust Resistant: " + zip3.isRustResistant);
    }
}