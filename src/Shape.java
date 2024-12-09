
public abstract class Shape {
String _color;
	public Shape (String color) {
		_color=color;
	}
	
	public String toString() {
		return "color of shape is :"+_color;
	}
	
	public abstract double getArre();
	public abstract boolean isSquare();	
	
}
