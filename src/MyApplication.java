import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // in assignment shape consists 6 points so u should input it
        System.out.print("number of points: ");
        int numPoints = scanner.nextInt();

        //  array in order to store the points
        Point[] points = new Point[numPoints];

        for (int i = 0; i < numPoints; i++) {
            System.out.print(" x-coordinate" + (i + 1) + ": ");
            double x = scanner.nextDouble();

            System.out.print(" y-coordinate" + (i + 1) + ": ");
            double y = scanner.nextDouble();

            points[i] = new Point(x, y);
        }

        // it is a shape  with the input points
        Shape shape = new Shape(points);

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());

        scanner.close();
    }
}
