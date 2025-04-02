class RocketRunner {
    public static void main(String[] args) {

        Rocket rocket1 = new Rocket("Falcon 9", "Orbital Rocket", 70.0, 549054.0, "RP-1/LOX", 2, true, 
                                    22800.0, "SpaceX", "USA", 67.0, 27000, "Cape Canaveral", 0, 
                                    true, 2020, false, true, "Satellite Deployment", 150);

        System.out.println("Rocket Name: " + rocket1.rocketName);
        System.out.println("Rocket Type: " + rocket1.rocketType);
        System.out.println("Rocket Height: " + rocket1.rocketHeight);
        System.out.println("Rocket Weight: " + rocket1.rocketWeight);
        System.out.println("Fuel Type: " + rocket1.fuelType);
        System.out.println("Stages: " + rocket1.stages);
        System.out.println("Is Reusable: " + rocket1.isReusable);
        System.out.println("Payload Capacity: " + rocket1.payloadCapacity);
        System.out.println("Manufacturer: " + rocket1.manufacturer);
        System.out.println("Country of Origin: " + rocket1.countryOfOrigin);
        System.out.println("Launch Cost: " + rocket1.launchCost);
        System.out.println("Max Speed: " + rocket1.maxSpeed );
        System.out.println("Launch Site: " + rocket1.launchSite);
        System.out.println("Crew Capacity: " + rocket1.crewCapacity);
        System.out.println("Has Autonomous Navigation: " + rocket1.hasAutonomousNavigation);
        System.out.println("Manufacturing Year: " + rocket1.manufacturingYear);
        System.out.println("Is Nuclear Powered: " + rocket1.isNuclearPowered);
        System.out.println("Has Escape System: " + rocket1.hasEscapeSystem);
        System.out.println("Mission Type: " + rocket1.missionType);
        System.out.println("Successful Missions: " + rocket1.successfulMissions);

        Rocket rocket2 = new Rocket("Saturn V", "Heavy Lift Rocket", 110.6, 2970000.0, "RP-1/LOX, LH2/LOX", 3, 
                                    false, 140000.0, "NASA", "USA", 185.0, 39800, "Kennedy Space Center", 3, 
                                    false, 1967, false, true, "Manned Lunar Mission", 13);

        System.out.println("Rocket Name: " + rocket2.rocketName);
        System.out.println("Rocket Type: " + rocket2.rocketType);
        System.out.println("Rocket Height: " + rocket2.rocketHeight);
        System.out.println("Rocket Weight: " + rocket2.rocketWeight);
        System.out.println("Fuel Type: " + rocket2.fuelType);
        System.out.println("Stages: " + rocket2.stages);
        System.out.println("Is Reusable: " + rocket2.isReusable);
        System.out.println("Payload Capacity: " + rocket2.payloadCapacity );
        System.out.println("Manufacturer: " + rocket2.manufacturer);
        System.out.println("Country of Origin: " + rocket2.countryOfOrigin);
        System.out.println("Launch Cost: " + rocket2.launchCost);
        System.out.println("Max Speed: " + rocket2.maxSpeed );
        System.out.println("Launch Site: " + rocket2.launchSite);
        System.out.println("Crew Capacity: " + rocket2.crewCapacity);
        System.out.println("Has Autonomous Navigation: " + rocket2.hasAutonomousNavigation);
        System.out.println("Manufacturing Year: " + rocket2.manufacturingYear);
        System.out.println("Is Nuclear Powered: " + rocket2.isNuclearPowered);
        System.out.println("Has Escape System: " + rocket2.hasEscapeSystem);
        System.out.println("Mission Type: " + rocket2.missionType);
        System.out.println("Successful Missions: " + rocket2.successfulMissions);

        Rocket rocket3 = new Rocket("Starship", "Interplanetary Rocket", 120.0, 5000000.0, "Methane/LOX", 2, 
                                    true, 150000.0, "SpaceX", "USA", 10.0, 29000, "Boca Chica", 100, 
                                    true, 2023, false, true, "Mars Colonization", 5);

        System.out.println("Rocket Name: " + rocket3.rocketName);
        System.out.println("Rocket Type: " + rocket3.rocketType);
        System.out.println("Rocket Height: " + rocket3.rocketHeight);
        System.out.println("Rocket Weight: " + rocket3.rocketWeight );
        System.out.println("Fuel Type: " + rocket3.fuelType);
        System.out.println("Stages: " + rocket3.stages);
        System.out.println("Is Reusable: " + rocket3.isReusable);
        System.out.println("Payload Capacity: " + rocket3.payloadCapacity);
        System.out.println("Manufacturer: " + rocket3.manufacturer);
        System.out.println("Country of Origin: " + rocket3.countryOfOrigin);
        System.out.println("Launch Cost: " + rocket3.launchCost);
        System.out.println("Max Speed: " + rocket3.maxSpeed);
        System.out.println("Launch Site: " + rocket3.launchSite);
        System.out.println("Crew Capacity: " + rocket3.crewCapacity);
        System.out.println("Has Autonomous Navigation: " + rocket3.hasAutonomousNavigation);
        System.out.println("Manufacturing Year: " + rocket3.manufacturingYear);
        System.out.println("Is Nuclear Powered: " + rocket3.isNuclearPowered);
        System.out.println("Has Escape System: " + rocket3.hasEscapeSystem);
        System.out.println("Mission Type: " + rocket3.missionType);
        System.out.println("Successful Missions: " + rocket3.successfulMissions);
    }
}