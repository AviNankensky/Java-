
public class Rectangle extends Shape{

	private double _length;
	private double _width;
	
public Rectangle(String color,double length, double width) {
	super(color);
	_length=length;
	_width=width;
}
public double getArre() {
	return _length*_width;
}
	
public boolean isSquare() { 	
	return _length==_width;
}
public String toString() {	
	return super.toString()+" my length is :"+_length+"and my width is :"+_width;
}
	
}
