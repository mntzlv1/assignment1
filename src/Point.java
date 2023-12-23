public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //  distance between second point and other point

    public double distanceTo(Point secondPoint) {
        // X and Y is equal to substract first point from second point which is this formula (x2-x1)^2
        // or (y2-y1)^2
        double X = secondPoint.x - this.x;
        double Y = secondPoint.y - this.y;

        //   distance formula
        double distance = Math.sqrt(X * X + Y * Y);

        return distance;
    }

    // point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
