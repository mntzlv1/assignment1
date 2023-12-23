public class MyApplication {
    public static void main(String[] args) {

        Point p1 = new Point(2, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(7, 5);
        Point p4 = new Point(0, 6);
        Point p5 = new Point(8, 1);
        Point p6 = new Point(1, 2);
        Point[] points = {p1, p2,p3,p4,p5,p6};
        Shape shape = new Shape(points);

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }
}
