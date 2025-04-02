class TabRunner {
    public static void main(String[] args) {

        Tab tab1 = new Tab("Apple", "iPad Pro", 12.9, "2732x2048", 8, 256, "Apple M2", "iPadOS", 10758, 
                           true, true, false, 12, true, true, "WiFi, Bluetooth", "USB-C", true, "USA", 1299.99);

        System.out.println("Brand: " + tab1.brand);
        System.out.println("Model: " + tab1.model);
        System.out.println("Screen Size: " + tab1.screenSize);
        System.out.println("Resolution: " + tab1.resolution);
        System.out.println("RAM Size: " + tab1.ramSize + " GB");
        System.out.println("Storage Capacity: " + tab1.storageCapacity );
        System.out.println("Processor: " + tab1.processor);
        System.out.println("Operating System: " + tab1.operatingSystem);
        System.out.println("Battery Capacity: " + tab1.batteryCapacity );
        System.out.println("Has SIM Support: " + tab1.hasSIMSupport);
        System.out.println("Has Stylus Support: " + tab1.hasStylusSupport);
        System.out.println("Has Expandable Storage: " + tab1.hasExpandableStorage);
        System.out.println("Camera: " + tab1.cameraMP );
        System.out.println("Has Face Recognition: " + tab1.hasFaceRecognition);
        System.out.println("Has Fingerprint Sensor: " + tab1.hasFingerprintSensor);
        System.out.println("Connectivity Options: " + tab1.connectivityOptions);
        System.out.println("Charging Port: " + tab1.chargingPort);
        System.out.println("Has 5G Support: " + tab1.has5GSupport);
        System.out.println("Country of Origin: " + tab1.countryOfOrigin);
        System.out.println("Price: " + tab1.price);

        
        Tab tab2 = new Tab("Samsung", "Galaxy Tab S9", 11.0, "2560x1600", 12, 512, "Snapdragon 8 Gen 2", 
                           "Android", 8400, true, true, true, 13, true, true, "WiFi, Bluetooth, LTE", 
                           "USB-C", true, "South Korea", 999.99);

        System.out.println("Brand: " + tab2.brand);
        System.out.println("Model: " + tab2.model);
        System.out.println("Screen Size: " + tab2.screenSize );
        System.out.println("Resolution: " + tab2.resolution);
        System.out.println("RAM Size: " + tab2.ramSize );
        System.out.println("Storage Capacity: " + tab2.storageCapacity );
        System.out.println("Processor: " + tab2.processor);
        System.out.println("Operating System: " + tab2.operatingSystem);
        System.out.println("Battery Capacity: " + tab2.batteryCapacity );
        System.out.println("Has SIM Support: " + tab2.hasSIMSupport);
        System.out.println("Has Stylus Support: " + tab2.hasStylusSupport);
        System.out.println("Has Expandable Storage: " + tab2.hasExpandableStorage);
        System.out.println("Camera: " + tab2.cameraMP );
        System.out.println("Has Face Recognition: " + tab2.hasFaceRecognition);
        System.out.println("Has Fingerprint Sensor: " + tab2.hasFingerprintSensor);
        System.out.println("Connectivity Options: " + tab2.connectivityOptions);
        System.out.println("Charging Port: " + tab2.chargingPort);
        System.out.println("Has 5G Support: " + tab2.has5GSupport);
        System.out.println("Country of Origin: " + tab2.countryOfOrigin);
        System.out.println("Price: " + tab2.price);
		
		
		
		Tab tab3 = new Tab("Lenovo", "Tab P12 Pro", 12.6, "2560x1600", 6, 128, "Qualcomm Snapdragon 870", 
                           "Android", 10200, true, true, true, 8, true, true, "WiFi, Bluetooth, 4G LTE", 
                           "USB-C", false, "China", 799.99);

       
        System.out.println("Brand: " + tab3.brand);
        System.out.println("Model: " + tab3.model);
        System.out.println("Screen Size: " + tab3.screenSize );
        System.out.println("Resolution: " + tab3.resolution);
        System.out.println("RAM Size: " + tab3.ramSize );
        System.out.println("Storage Capacity: " + tab3.storageCapacity);
        System.out.println("Processor: " + tab3.processor);
        System.out.println("Operating System: " + tab3.operatingSystem);
        System.out.println("Battery Capacity: " + tab3.batteryCapacity );
        System.out.println("Has SIM Support: " + tab3.hasSIMSupport);
        System.out.println("Has Stylus Support: " + tab3.hasStylusSupport);
        System.out.println("Has Expandable Storage: " + tab3.hasExpandableStorage);
        System.out.println("Camera: " + tab3.cameraMP );
        System.out.println("Has Face Recognition: " + tab3.hasFaceRecognition);
        System.out.println("Has Fingerprint Sensor: " + tab3.hasFingerprintSensor);
        System.out.println("Connectivity Options: " + tab3.connectivityOptions);
        System.out.println("Charging Port: " + tab3.chargingPort);
        System.out.println("Has 5G Support: " + tab3.has5GSupport);
        System.out.println("Country of Origin: " + tab3.countryOfOrigin);
        System.out.println("Price: " + tab3.price);
    }
}