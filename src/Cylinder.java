
public class Cylinder extends Circle{

	private double _height;
	
	public Cylinder() {
		this(1.0,1.0);
	}
	
	public Cylinder(double h,double r) {
		super(r);
		_height=h;
	}
	
public double getArea() {
	return 2*super.getArea()+2*Math.PI*_radius*_height;
}

public double getVolume() {
	return  _height*super.getArea();
}

public String toString() {
	return "height = "+_height+"color = " +" "+super.toString();
}
}


