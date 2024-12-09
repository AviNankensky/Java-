/*This class accepts an analytical point (X,Y,Z) and the length, height,width of a box
 * and calculate
 * If two dice are equal
 * and can move a cube in the spread
 * and knows how to print certain points in the cube
 * and knows how to return the center of the cube
 * and the distance between the two centers of the cubes
 * and the volume of the cube
 * and the surface area of the cube
 */
public class Box3D {
	
	//Setting Variables
	private Point3D base;
	private int _length, _width, _height;
	final int DEFAULT_VAL = 0, DEFAULT_VAL_POSITIVE = 1;
	double _x, _y, _z;
	public Box3D getVolume;
	public Box3D() {
		_length = 1; 
		_width = 1;
		_height = 1;
		base = new Point3D(0.0, 0.0, 0.0);
	}
	//Set the values of x,y,z to 0 and the values of _length, _width, _height to 1 if is lower the 0 or 0
	public Box3D(double x, double y, double z, int length, int width, int height) {
		_length = (length <= DEFAULT_VAL) ? DEFAULT_VAL_POSITIVE : length;
		_width = (width <= DEFAULT_VAL) ? DEFAULT_VAL_POSITIVE : width;
		_height = (height <= DEFAULT_VAL) ? DEFAULT_VAL_POSITIVE : height;
		this.base = new Point3D(x, y, z);
		_x = x;
		_y = y;
		_z = z;
	}

	//Compares the variables that enter. to variables of the class
	public Box3D(Box3D other) {
		_x = other._x;
		_y = other._y;
		_z = other._z;
		_length = other._length;
		_width = other._width;
		_height = other._height;
	}
	
	//The retrieval methods
	public int getLength() {
		return _length;
	}
	public int getWidth() {
		return _width;
	}
	public int getHeight() {
		return _height;
	}
	public Point3D getBase() {
		return base;
	}
	
	//the determining methods
	public void setLength(int num) {
		_length = (num <= DEFAULT_VAL) ? _length : num;
	}
	public void setWidth(int num) {
		_width = (num<=DEFAULT_VAL)?_width:num;
	}
	public void setHeight(int num) {
		_height = (num<=DEFAULT_VAL)?_height:num;
	}
	public void setBase(Point3D p) {
		this.base = new Point3D(p);
	}

	//Return the values of the point and the measurements
	public String toString() {
		return "The base point is " + base + ", length = " + _length + ", width = " + _width + ", height = " + _height;
	}

	//It checks if the two Box are equal
	public boolean equals(Box3D other) {
		return (_height == other._height) && (_width == other._width) && (_length == other._length)
				&& (base.equals(other.base));
	}
	//It checks if the variables are equal to 0 and if not then it advances a signal according to the data
	public Box3D move(double dX, double dY, double dZ) {
		if((_x+dX>DEFAULT_VAL)&&(_y+dY>DEFAULT_VAL)&&(_z+dZ>DEFAULT_VAL))
		dX += _x;
		dY += _y;
		dZ += _z;
		return new Box3D(_x+dX,_y+dY,_z+dZ, _length, _width, _height);
	}
    //is get Up Right Back Point of the Box
	public Point3D getUpRightBackPoint() {
		return new Point3D(_x + _length, _y + _width, _z + _height);
	}
	//is get the center of the Box
	public Point3D getCenter() {
		double doublelength = _length;
		double doublewidth = _width;
		double doubleheight = _height;
		return new Point3D((_x + (doublelength / 2)), (_y +( doublewidth / 2)), (_z + (doubleheight / 2)));
	}
	//It calculates the distance between two center points of the two boxes
	public double distance(Box3D other) {
		return Math.sqrt(Math.pow((this._x - other._x), 2) + Math.pow((this._y - other._y), 2)
				+ Math.pow((this._z - other._z), 2));
	}
	//is calculates the volume of the Box
	public int getVolume() {
		return _length * _width * _height;
	}
	//is calculates the surf area of the Box
	public int getSurfaceArea() {
		return 2 * (_length * _width + _length * _height + _width * _height);
	}
	//It calculates which box has a larger capacity
	public boolean isLargerCapacity(Box3D other) {
		return this.getVolume() > other.getVolume();
	}
	//It calculates whether one box can contain the other box inside
	public boolean contains(Box3D other) {
		return (this._height < other._height) && (this._length < other._length) && (this._width < other._width);
	}
	//It calculates whether the box is above the other box
	public boolean isAbove(Box3D other) {
		return this._z > other._z + other._height;
	}

	public static void main(String[] args) {
		Box3D p1 = new Box3D(1, 1, 1, 1, 1, 1);
		Box3D p2 = new Box3D(2, 2, 2, 2, 2, 2);
		
		//System.out.println(p1.getLength());
		//System.out.println(p1.getWidth());
		//System.out.println(p1.getHeight());
		//System.out.println(p1.getBase());
		//System.out.println(p1.isAbove(p2));
		
		//p1.setLength(3);
		//p1.setWidth(3);
		//p1.setHeight(3);
		//Point3D newPoint = new Point3D(3,3,3);
	    //p1.setBase(newPoint);
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		
		//System.out.println(p1.move(10, 10, 10));	
		
		//System.out.println(p1.getUpRightBackPoint());
		System.out.println(p1.getCenter());
		//System.out.println(p1.distance(p2));
		//System.out.println(p1.getVolume());
		//System.out.println(p1.getSurfaceArea());
		//System.out.println(p1.isLargerCapacity(p2));
		//System.out.println(p1.contains(p2));
	} //end of nain
	
}//end of Box3D class
