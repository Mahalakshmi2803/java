class DustbinRunner {
    public static void main(String[] args) {

        Dustbin bin1 = new Dustbin("Outdoor Bin", "Plastic", 50.0, "Green", true, true, "Round", false, 
                                   "Garden", false, "EcoBin", "USA", 29.99, 2, 5.0, true, false, 
                                   "Swing Lid", 2023, false);

       
        System.out.println("Bin Material: " + bin1.binMaterial);
        System.out.println("Bin Capacity: " + bin1.binCapacity );
        System.out.println("Bin Color: " + bin1.binColor);
        System.out.println("Has Lid: " + bin1.hasLid);
        System.out.println("Is Recyclable: " + bin1.isRecyclable);
        System.out.println("Bin Shape: " + bin1.binShape);
        System.out.println("Has Foot Pedal: " + bin1.hasFootPedal);
        System.out.println("Usage Area: " + bin1.usageArea);
        System.out.println("Is Smart Bin: " + bin1.isSmartBin);
        System.out.println("Manufacturer: " + bin1.manufacturer);
        System.out.println("Country of Origin: " + bin1.countryOfOrigin);
        System.out.println("Bin Price: " + bin1.binPrice);
        System.out.println("Warranty Years: " + bin1.warrantyYears);
        System.out.println("Bin Weight: " + bin1.binWeight );
        System.out.println("Is Odor Control: " + bin1.isOdorControl);
        System.out.println("Has Partition: " + bin1.hasPartition);
        System.out.println("Opening Mechanism: " + bin1.openingMechanism);
        System.out.println("Manufacturing Year: " + bin1.manufacturingYear);
        System.out.println("Is Fire Resistant: " + bin1.isFireResistant);

        Dustbin bin2 = new Dustbin("Indoor Bin", "Stainless Steel", 30.0, "Silver", true, false, "Rectangle", 
                                   true, "Kitchen", true, "SmartWaste", "Germany", 99.99, 3, 6.5, true, 
                                   true, "Sensor Lid", 2024, true);

        
        System.out.println("Bin Material: " + bin2.binMaterial);
        System.out.println("Bin Capacity: " + bin2.binCapacity );
        System.out.println("Bin Color: " + bin2.binColor);
        System.out.println("Has Lid: " + bin2.hasLid);
        System.out.println("Is Recyclable: " + bin2.isRecyclable);
        System.out.println("Bin Shape: " + bin2.binShape);
        System.out.println("Has Foot Pedal: " + bin2.hasFootPedal);
        System.out.println("Usage Area: " + bin2.usageArea);
        System.out.println("Is Smart Bin: " + bin2.isSmartBin);
        System.out.println("Manufacturer: " + bin2.manufacturer);
        System.out.println("Country of Origin: " + bin2.countryOfOrigin);
        System.out.println("Bin Price: " + bin2.binPrice);
        System.out.println("Warranty Years: " + bin2.warrantyYears);
        System.out.println("Bin Weight: " + bin2.binWeight);
        System.out.println("Is Odor Control: " + bin2.isOdorControl);
        System.out.println("Has Partition: " + bin2.hasPartition);
        System.out.println("Opening Mechanism: " + bin2.openingMechanism);
        System.out.println("Manufacturing Year: " + bin2.manufacturingYear);
        System.out.println("Is Fire Resistant: " + bin2.isFireResistant);

        Dustbin bin3 = new Dustbin("Commercial Bin", "Metal", 100.0, "Blue", true, true, "Square", false, 
                                   "Office", false, "RecyclePro", "UK", 149.99, 5, 12.0, false, true, 
                                   "Push Lid", 2025, true);

        
        System.out.println("Bin Material: " + bin3.binMaterial);
        System.out.println("Bin Capacity: " + bin3.binCapacity );
        System.out.println("Bin Color: " + bin3.binColor);
        System.out.println("Has Lid: " + bin3.hasLid);
        System.out.println("Is Recyclable: " + bin3.isRecyclable);
        System.out.println("Bin Shape: " + bin3.binShape);
        System.out.println("Has Foot Pedal: " + bin3.hasFootPedal);
        System.out.println("Usage Area: " + bin3.usageArea);
        System.out.println("Is Smart Bin: " + bin3.isSmartBin);
        System.out.println("Manufacturer: " + bin3.manufacturer);
        System.out.println("Country of Origin: " + bin3.countryOfOrigin);
        System.out.println("Bin Price: " + bin3.binPrice);
        System.out.println("Warranty Years: " + bin3.warrantyYears);
        System.out.println("Bin Weight: " + bin3.binWeight);
        System.out.println("Is Odor Control: " + bin3.isOdorControl);
        System.out.println("Has Partition: " + bin3.hasPartition);
        System.out.println("Opening Mechanism: " + bin3.openingMechanism);
        System.out.println("Manufacturing Year: " + bin3.manufacturingYear);
        System.out.println("Is Fire Resistant: " + bin3.isFireResistant);
    }
}