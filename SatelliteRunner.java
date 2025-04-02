class SatelliteRunner {
    public static void main(String[] args) {

        Satellite satellite1 = new Satellite("Hubble Space Telescope", "Astronomical", 11110.0, 13.2, 
                                             "Low Earth Orbit", "Space Shuttle Discovery", 1990, false, 
                                             33.0, "NASA", "USA", true, 2800.0, "Optical", false, 
                                             true, 35, false, "Space Observation", 1);

        System.out.println("Satellite Name: " + satellite1.satelliteName);
        System.out.println("Satellite Type: " + satellite1.satelliteType);
        System.out.println("Satellite Weight: " + satellite1.satelliteWeight);
        System.out.println("Satellite Height: " + satellite1.satelliteHeight);
        System.out.println("Orbit Type: " + satellite1.orbitType);
        System.out.println("Launch Vehicle: " + satellite1.launchVehicle);
        System.out.println("Launch Year: " + satellite1.launchYear);
        System.out.println("Is Geostationary: " + satellite1.isGeostationary);
        System.out.println("Mission Duration: " + satellite1.missionDuration);
        System.out.println("Manufacturer: " + satellite1.manufacturer);
        System.out.println("Country of Origin: " + satellite1.countryOfOrigin);
        System.out.println("Has Solar Panels: " + satellite1.hasSolarPanels);
        System.out.println("Power Capacity: " + satellite1.powerCapacity );
        System.out.println("Communication Band: " + satellite1.communicationBand);
        System.out.println("Is Military Use: " + satellite1.isMilitaryUse);
        System.out.println("Has Autonomous Navigation: " + satellite1.hasAutonomousNavigation);
        System.out.println("Operational Lifespan: " + satellite1.operationalLifespan );
        System.out.println("Is Reusable: " + satellite1.isReusable);
        System.out.println("Mission Purpose: " + satellite1.missionPurpose);
        System.out.println("Successful Missions: " + satellite1.successfulMissions);

        Satellite satellite2 = new Satellite("GPS III", "Navigation", 3880.0, 4.0, 
                                             "Medium Earth Orbit", "Falcon 9", 2020, true, 
                                             15.0, "Lockheed Martin", "USA", true, 4500.0, 
                                             "L-band", true, true, 15, false, "Global Positioning", 10);

        System.out.println("Satellite Name: " + satellite2.satelliteName);
        System.out.println("Satellite Type: " + satellite2.satelliteType);
        System.out.println("Satellite Weight: " + satellite2.satelliteWeight);
        System.out.println("Satellite Height: " + satellite2.satelliteHeight);
        System.out.println("Orbit Type: " + satellite2.orbitType);
        System.out.println("Launch Vehicle: " + satellite2.launchVehicle);
        System.out.println("Launch Year: " + satellite2.launchYear);
        System.out.println("Is Geostationary: " + satellite2.isGeostationary);
        System.out.println("Mission Duration: " + satellite2.missionDuration);
        System.out.println("Manufacturer: " + satellite2.manufacturer);
        System.out.println("Country of Origin: " + satellite2.countryOfOrigin);
        System.out.println("Has Solar Panels: " + satellite2.hasSolarPanels);
        System.out.println("Power Capacity: " + satellite2.powerCapacity );
        System.out.println("Communication Band: " + satellite2.communicationBand);
        System.out.println("Is Military Use: " + satellite2.isMilitaryUse);
        System.out.println("Has Autonomous Navigation: " + satellite2.hasAutonomousNavigation);
        System.out.println("Operational Lifespan: " + satellite2.operationalLifespan);
        System.out.println("Is Reusable: " + satellite2.isReusable);
        System.out.println("Mission Purpose: " + satellite2.missionPurpose);
        System.out.println("Successful Missions: " + satellite2.successfulMissions);

        Satellite satellite3 = new Satellite("INSAT-3DR", "Weather", 2211.0, 2.9, 
                                             "Geostationary Orbit", "GSLV Mk II", 2016, true, 
                                             12.0, "ISRO", "India", true, 1700.0, "C-band", false, 
                                             false, 10, false, "Weather Monitoring", 7);

        System.out.println("Satellite Name: " + satellite3.satelliteName);
        System.out.println("Satellite Type: " + satellite3.satelliteType);
        System.out.println("Satellite Weight: " + satellite3.satelliteWeight);
        System.out.println("Satellite Height: " + satellite3.satelliteHeight);
        System.out.println("Orbit Type: " + satellite3.orbitType);
        System.out.println("Launch Vehicle: " + satellite3.launchVehicle);
        System.out.println("Launch Year: " + satellite3.launchYear);
        System.out.println("Is Geostationary: " + satellite3.isGeostationary);
        System.out.println("Mission Duration: " + satellite3.missionDuration);
        System.out.println("Manufacturer: " + satellite3.manufacturer);
        System.out.println("Country of Origin: " + satellite3.countryOfOrigin);
        System.out.println("Has Solar Panels: " + satellite3.hasSolarPanels);
        System.out.println("Power Capacity: " + satellite3.powerCapacity);
        System.out.println("Communication Band: " + satellite3.communicationBand);
        System.out.println("Is Military Use: " + satellite3.isMilitaryUse);
        System.out.println("Has Autonomous Navigation: " + satellite3.hasAutonomousNavigation);
        System.out.println("Operational Lifespan: " + satellite3.operationalLifespan);
        System.out.println("Is Reusable: " + satellite3.isReusable);
        System.out.println("Mission Purpose: " + satellite3.missionPurpose);
        System.out.println("Successful Missions: " + satellite3.successfulMissions);
    }
}