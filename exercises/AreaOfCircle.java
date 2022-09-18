package codingExercises;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(calcAreaOfCircle(3));
    }

    /**
     * This method calculates the area of a circle
     * It uses the formula :  A = PI * radius^2
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        // A = PI * r^2
        double area;
        area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
