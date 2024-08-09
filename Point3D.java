/*
 * The `Point3D` class represents a point in 3D space. It allows 
 * creation, copying, moving, and comparing points, and calculating the 
 * distance between them.
 */
//Setting Variables
public class Point3D {
    double _x;
    double _y;
    double _z;
    final int DEFAULT_VAL = 0;

    // Set the values of the variables to 0
    public Point3D() {
        _x = 0;
        _y = 0;
        _z = 0;
    }

    // Compares the variables that enter. to variables of the class
    public Point3D(double x, double y, double z) {
        _x = x;
        _y = y;
        _z = z;
    }

    // Copy constructor
    public Point3D(Point3D other) {
        _x = other._x;
        _y = other._y;
        _z = other._z;
    }

    // The retrieval methods
    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    public double getZ() {
        return _z;
    }

    // the determining methods
    public void setX(double num) {
        _x = num;
    }

    public void setY(double num) {
        _y = num;
    }

    public void setZ(double num) {
        _z = num;
    }

    // Return the values of the point
    public String toString() {
        return "(" + _x + "," + _y + "," + _z + ")";
    }

    // It checks if the two points are equal
    public boolean equals(Point3D other) {
        return (_x == other._x) && (_y == other._y) && (_z == other._z);
    }

    // It checks whether one point is above the other point
    public boolean isAbove(Point3D other) {
        return (_y > other._y);
    }

    // It checks whether one point is under the other point
    public boolean isUnder(Point3D other) {
        return other.isAbove(this);
    }

    // It checks if one point is more left than the other point
    public boolean isLeft(Point3D other) {
        return (_x < other._x);
    }

    // It checks if one point is more right than the other point
    public boolean isRight(Point3D other) {
        return other.isLeft(this);
    }

    // It checks if one point is behind another point
    public boolean isBehind(Point3D other) {
        return (_z < other._z);
    }

    // It checks whether one point is before another point
    public boolean isInFrontOf(Point3D other) {
        return other.isBehind(this);
    }

    // It checks if the variables are equal to 0 and if not then it advances a
    // signal according to the data
    public void move(double dX, double dY, double dZ) {
        if ((_x + dX >= DEFAULT_VAL) && (_y + dY >= DEFAULT_VAL) && (_z + dZ >= DEFAULT_VAL))
            setX(_x += dX);
        setY(_y += dY);
        setZ(_z += dZ);
    }

    // It calculates the distance between point to point
    public double distance(Point3D p) {
        return (Math.sqrt(Math.pow((_x - p._x), 2) + Math.pow((_y - p._y), 2) + Math.pow((_z - p._z), 2)) / 2);

    }

    public static void main(String[] args) {

        Point3D p1 = new Point3D(1, 1, 1);
        Point3D p2 = new Point3D(2, 2, 2);
        System.out.println(p1.toString());
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getZ());

        // p1.setX(3);
        // p1.setY(3);
        // p1.setZ(3);

        // System.out.println(p1.toString());
        // System.out.println(p1.equals(p2));
        // System.out.println(p1.isAbove(p2));
        // System.out.println(p1.isUnder(p2));
        // System.out.println(p1.isLeft(p2));
        // System.out.println(p1.isRight(p2));
        // System.out.println(p1.isBehind(p2));
        // System.out.println(p1.isInFrontOf(p2));

        // p1.move(1, 1, 1);
        // System.out.println(p1.toString());
        // System.out.println(p1.distance(p2));

    }

}
