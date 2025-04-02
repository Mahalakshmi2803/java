class DroneRunner {
    public static void main(String[] args) {

        Drone drone1 = new Drone("Phantom 4", "DJI", 1.38, 30.0, 72.0, 6000.0, 
                                 5870.0, 4, true, 20.0, true, false, "Quadcopter", 
                                 7.0, true, false, "Remote Control", 1499.99, 2023, false);

        System.out.println("Model Name: " + drone1.modelName);
        System.out.println("Manufacturer: " + drone1.manufacturer);
        System.out.println("Weight: " + drone1.weight);
        System.out.println("Max Flight Time: " + drone1.maxFlightTime );
        System.out.println("Max Speed: " + drone1.maxSpeed );
        System.out.println("Max Altitude: " + drone1.maxAltitude );
        System.out.println("Battery Capacity: " + drone1.batteryCapacity);
        System.out.println("Number of Rotors: " + drone1.numberOfRotors);
        System.out.println("Has Camera: " + drone1.hasCamera);
        System.out.println("Camera Resolution: " + drone1.cameraResolution);
        System.out.println("Has GPS: " + drone1.hasGPS);
        System.out.println("Is Autonomous: " + drone1.isAutonomous);
        System.out.println("Drone Type: " + drone1.droneType);
        System.out.println("Range: " + drone1.range );
        System.out.println("Has Obstacle Avoidance: " + drone1.hasObstacleAvoidance);
        System.out.println("Is Water Resistant: " + drone1.isWaterResistant);
        System.out.println("Control Type: " + drone1.controlType);
        System.out.println("Price: " + drone1.price);
        System.out.println("Manufacturing Year: " + drone1.manufacturingYear);
        System.out.println("Has Night Vision: " + drone1.hasNightVision);

        Drone drone2 = new Drone("Mavic Air 2", "DJI", 0.57, 34.0, 68.4, 5000.0, 
                                 3500.0, 4, true, 48.0, true, false, "Quadcopter", 
                                 10.0, true, false, "App Control", 999.99, 2024, true);

        System.out.println("Model Name: " + drone2.modelName);
        System.out.println("Manufacturer: " + drone2.manufacturer);
        System.out.println("Weight: " + drone2.weight);
        System.out.println("Max Flight Time: " + drone2.maxFlightTime);
        System.out.println("Max Speed: " + drone2.maxSpeed );
        System.out.println("Max Altitude: " + drone2.maxAltitude);
        System.out.println("Battery Capacity: " + drone2.batteryCapacity);
        System.out.println("Number of Rotors: " + drone2.numberOfRotors);
        System.out.println("Has Camera: " + drone2.hasCamera);
        System.out.println("Camera Resolution: " + drone2.cameraResolution);
        System.out.println("Has GPS: " + drone2.hasGPS);
        System.out.println("Is Autonomous: " + drone2.isAutonomous);
        System.out.println("Drone Type: " + drone2.droneType);
        System.out.println("Range: " + drone2.range);
        System.out.println("Has Obstacle Avoidance: " + drone2.hasObstacleAvoidance);
        System.out.println("Is Water Resistant: " + drone2.isWaterResistant);
        System.out.println("Control Type: " + drone2.controlType);
        System.out.println("Price: " + drone2.price);
        System.out.println("Manufacturing Year: " + drone2.manufacturingYear);
        System.out.println("Has Night Vision: " + drone2.hasNightVision);

        Drone drone3 = new Drone("Inspire 2", "DJI", 4.25, 27.0, 94.0, 5000.0, 
                                 4280.0, 4, true, 24.0, true, true, "Professional", 
                                 15.0, true, false, "Remote Control", 3299.99, 2025, true);

        System.out.println("Model Name: " + drone3.modelName);
        System.out.println("Manufacturer: " + drone3.manufacturer);
        System.out.println("Weight: " + drone3.weight);
        System.out.println("Max Flight Time: " + drone3.maxFlightTime );
        System.out.println("Max Speed: " + drone3.maxSpeed );
        System.out.println("Max Altitude: " + drone3.maxAltitude);
        System.out.println("Battery Capacity: " + drone3.batteryCapacity);
        System.out.println("Number of Rotors: " + drone3.numberOfRotors);
        System.out.println("Has Camera: " + drone3.hasCamera);
        System.out.println("Camera Resolution: " + drone3.cameraResolution );
        System.out.println("Has GPS: " + drone3.hasGPS);
        System.out.println("Is Autonomous: " + drone3.isAutonomous);
        System.out.println("Drone Type: " + drone3.droneType);
        System.out.println("Range: " + drone3.range );
        System.out.println("Has Obstacle Avoidance: " + drone3.hasObstacleAvoidance);
        System.out.println("Is Water Resistant: " + drone3.isWaterResistant);
        System.out.println("Control Type: " + drone3.controlType);
        System.out.println("Price: " + drone3.price);
        System.out.println("Manufacturing Year: " + drone3.manufacturingYear);
        System.out.println("Has Night Vision: " + drone3.hasNightVision);
    }
}