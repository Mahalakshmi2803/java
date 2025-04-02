class PlanetRunner {
    public static void main(String[] args) {

        Planet planet1 = new Planet("Earth", 5.972e24, 12742.0, 9.8, 365.25, 
                                    false, 1, true, "Nitrogen", 
                                    "Terrestrial", 15.0, 149.6e6, false, 
                                    true, true, true, 24.0, true, "Unknown", 0);

        System.out.println("Planet Name: " + planet1.planetName);
        System.out.println("Planet Mass: " + planet1.planetMass);
        System.out.println("Planet Diameter: " + planet1.planetDiameter );
        System.out.println("Gravity: " + planet1.planetGravity);
        System.out.println("Orbital Period: " + planet1.planetOrbitalPeriod );
        System.out.println("Has Rings: " + planet1.hasRings);
        System.out.println("Number of Moons: " + planet1.numberOfMoons);
        System.out.println("Has Life: " + planet1.hasLife);
        System.out.println("Atmosphere Composition: " + planet1.atmosphereComposition);
        System.out.println("Planet Type: " + planet1.planetType);
        System.out.println("Average Temperature: " + planet1.averageTemperature);
        System.out.println("Distance from Sun: " + planet1.distanceFromSun);
        System.out.println("Is Dwarf Planet: " + planet1.isDwarfPlanet);
        System.out.println("Has Magnetic Field: " + planet1.hasMagneticField);
        System.out.println("Is Terrestrial: " + planet1.isTerrestrial);
        System.out.println("Has Water: " + planet1.hasWater);
        System.out.println("Rotation Period: " + planet1.rotationPeriod);
        System.out.println("Is Habitable: " + planet1.isHabitable);
        System.out.println("Discovered By: " + planet1.discoveredBy);
        System.out.println("Discovery Year: " + planet1.discoveryYear);

        Planet planet2 = new Planet("Mars", 6.417e23, 6779.0, 3.7, 687.0, 
                                    false, 2, false, "Carbon Dioxide", 
                                    "Terrestrial", -63.0, 227.9e6, false, 
                                    false, true, true, 24.6, false, "Unknown", 0);

        System.out.println("Planet Name: " + planet2.planetName);
        System.out.println("Planet Mass: " + planet2.planetMass );
        System.out.println("Planet Diameter: " + planet2.planetDiameter );
        System.out.println("Gravity: " + planet2.planetGravity );
        System.out.println("Orbital Period: " + planet2.planetOrbitalPeriod);
        System.out.println("Has Rings: " + planet2.hasRings);
        System.out.println("Number of Moons: " + planet2.numberOfMoons);
        System.out.println("Has Life: " + planet2.hasLife);
        System.out.println("Atmosphere Composition: " + planet2.atmosphereComposition);
        System.out.println("Planet Type: " + planet2.planetType);
        System.out.println("Average Temperature: " + planet2.averageTemperature);
        System.out.println("Distance from Sun: " + planet2.distanceFromSun);
        System.out.println("Is Dwarf Planet: " + planet2.isDwarfPlanet);
        System.out.println("Has Magnetic Field: " + planet2.hasMagneticField);
        System.out.println("Is Terrestrial: " + planet2.isTerrestrial);
        System.out.println("Has Water: " + planet2.hasWater);
        System.out.println("Rotation Period: " + planet2.rotationPeriod);
        System.out.println("Is Habitable: " + planet2.isHabitable);
        System.out.println("Discovered By: " + planet2.discoveredBy);
        System.out.println("Discovery Year: " + planet2.discoveryYear);

        Planet planet3 = new Planet("Saturn", 5.683e26, 116460.0, 10.4, 10759.0, 
                                    true, 83, false, "Hydrogen", 
                                    "Gas Giant", -139.0, 1.429e9, false, 
                                    true, false, false, 10.7, false, "Unknown", 0);

        System.out.println("Planet Name: " + planet3.planetName);
        System.out.println("Planet Mass: " + planet3.planetMass);
        System.out.println("Planet Diameter: " + planet3.planetDiameter);
        System.out.println("Gravity: " + planet3.planetGravity);
        System.out.println("Orbital Period: " + planet3.planetOrbitalPeriod);
        System.out.println("Has Rings: " + planet3.hasRings);
        System.out.println("Number of Moons: " + planet3.numberOfMoons);
        System.out.println("Has Life: " + planet3.hasLife);
        System.out.println("Atmosphere Composition: " + planet3.atmosphereComposition);
        System.out.println("Planet Type: " + planet3.planetType);
        System.out.println("Average Temperature: " + planet3.averageTemperature);
        System.out.println("Distance from Sun: " + planet3.distanceFromSun);
        System.out.println("Is Dwarf Planet: " + planet3.isDwarfPlanet);
        System.out.println("Has Magnetic Field: " + planet3.hasMagneticField);
        System.out.println("Is Terrestrial: " + planet3.isTerrestrial);
        System.out.println("Has Water: " + planet3.hasWater);
        System.out.println("Rotation Period: " + planet3.rotationPeriod);
        System.out.println("Is Habitable: " + planet3.isHabitable);
        System.out.println("Discovered By: " + planet3.discoveredBy);
        System.out.println("Discovery Year: " + planet3.discoveryYear);
    }
}