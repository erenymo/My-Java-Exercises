package exercises;

// This program calculates the Centripetal Force.

public class CentripetalForce {
    public static void main(String[] args) {
        double radius = 0.8;
        double period = 3;
        double mass = 0.2;
        System.out.println(calcCentripetalForce(mass, radius, period));
    }

    private static double calcPathVelocity(double radius, double period) {
        double circumference = 2 * Math.PI * radius;
        double pathVelocity = circumference / period ;
        return pathVelocity;
    }

    private static double calcCentripetalAcceleration (double pathVelocity, double radius) {
        double centripetalAcceleration = Math.pow(pathVelocity,2) / radius;
        return centripetalAcceleration;
    }

    private static double calcCentripetalForce (double mass, double acceleration) {
        double calcCentripetalForce = mass * acceleration;
        return calcCentripetalForce;
    }

    public static double calcCentripetalForce (double mass, double radius, double period) {
        double pathVelocity = calcPathVelocity(radius, period);
        double centripetalAcceleration = calcCentripetalAcceleration(pathVelocity, radius);
        double centripetalForce = calcCentripetalForce(mass,centripetalAcceleration);
        return centripetalForce;
    }

}
