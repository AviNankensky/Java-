
public class Triangle extends Shape{

	private double _base;
	private double _height;
	
	public Triangle (String color, double base, double height) { 
		super(color);
		_base=base;
		_height=height;
	}
	
	public double getArre() {
		return _base * _height / 2;
	}
	
	public String toString() {
		return super.toString()+" my base is :"+_base+"and my height is :"+_height;
	}
	
	
	
	
}
