// an example that uses the Planet enum
// (taken from Effective Java by J. Bloch)

public class UsePlanet {
    public static void main(String[] args) {
        double earthWeight = 164.5;   // the user weighs 164.5 lbs
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on " + p + " is " + p.surfaceWeight(mass));
        }
    }
}

/*
Weight on MERCURY is 66.133672
Weight on VENUS is 158.383926
Weight on EARTH is 175.000000
Weight on MARS is 66.430699
Weight on JUPITER is 442.693902
Weight on SATURN is 186.464970
Weight on URANUS is 158.349709
Weight on NEPTUNE is 198.846116
*/
