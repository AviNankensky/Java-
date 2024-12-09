
public class Circle {

	protected double _radius;
	private Point _center;
	protected String _color="";
	private final int DEFAULT_RADIUS=1;
	private final int DEFAULT_VAL=0;
	
	
	public Circle(double r) {
		_radius = r;
		_color ="red";
	}
	public Circle(int x,int y,double radius) {
		
		
		_center=new Point(x,y);
		_radius=radius;
		if (radius<=DEFAULT_VAL)
			_radius = DEFAULT_RADIUS;
	}
	public Circle (Point center,double radius) {
	_center = new Point(center);
	_radius= radius;
	if(_radius<=DEFAULT_VAL)
		_radius=DEFAULT_RADIUS;	
	}
	
	public Circle(Circle other) {
		_center= new Point (other._center);
		_radius=other._radius;
	}
	
	
	
	public Point getCenter() {
		return new Point(_center);
	}
	public double getRadius() {
		return _radius;
	}
	
	
	public void setCenter(Point center) {
		_center=new Point(center);
	}
	public void setRadius(double radius) {
		_radius =radius; 
	}
	
	
	public double getPerimeter() {
		return(2*Math.PI*_radius);
	}
	public double getArea() {
		return(Math.PI*_radius*_radius); 
	}
	public void move (int deltaX,int deltaY) {
		_center.move(deltaX, deltaY);
	}
	public boolean equals(Circle other) {
		if(_center.equals(other._center)&&_radius==other._radius)
		return true;
	else
		return false;
	}
	public boolean isLarger(Circle other) {
		return (this.getArea()>other.getArea());
	}
	public boolean isInCircle(Point p) {
		return(_center.distance(p)<=_radius);
	}
	public String toString() {
		return ("The center of the circle = "+
	"and the radius = "+_radius);
	}
	
	

}
