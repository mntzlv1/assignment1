public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    // perimeter
    public double perimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.length - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }

        perimeter += points[points.length - 1].distanceTo(points[0]);

        return perimeter;
    }

    // longest side
    public double longestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.length - 1; i++) {
            double currentSide = points[i].distanceTo(points[i + 1]);
            longestSide = Math.max(longestSide, currentSide);
        }

        double lastSideLength = points[points.length - 1].distanceTo(points[0]);
        longestSide = Math.max(longestSide, lastSideLength);

        return longestSide;
    }

    //  average length of sides
    public double averageSide() {
        double totalSidelen = 0;

        for (int i = 0; i < points.length - 1; i++) {
            totalSidelen += points[i].distanceTo(points[i + 1]);
        }

        // Add the distance from the last point to the first point to close the shape
        totalSidelen += points[points.length - 1].distanceTo(points[0]);

        // Calculate the average side length
        double averageSideLength = totalSidelen / points.length;

        return averageSideLength;
    }
}
