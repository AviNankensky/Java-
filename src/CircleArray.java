
public class CircleArray {

	private Circle[] _circleArr;
	private int _noOfCircles;

	public final int MAX_CIRCLE = 10;

	public CircleArray() {
		_circleArr = new Circle[MAX_CIRCLE];
		_noOfCircles = 0;
	}

	public boolean addCircle(Point p, double r) {
		if (_noOfCircles == MAX_CIRCLE) {
			return false;
		}
		_circleArr[_noOfCircles++] = new Circle(p, r);
		return true;
	}

	public Circle highestCircle() {
		if (_noOfCircles == 0) {
			return null;
		}
		Circle highest = _circleArr[0];
		for (int i = 1; i < _noOfCircles; i++)
			if (_circleArr[i].getCenter().isAbove(highest.getCenter()))
				highest = _circleArr[i];
		return new Circle(highest);
	}

	public Circle biggesCircle() {
		if (_noOfCircles == 0)
			return null;
		Circle biggest = _circleArr[0];
		for (int i = 1; i < _noOfCircles; i++) {

			if (_circleArr[i].area() > biggest.area()) {
				biggest = _circleArr[i];
			}
		}
		return new Circle(biggest);
	}

	public boolean removeCircle(Circle c) {
		int i;
		for (i = 0; i < _noOfCircles; i++) {
			if (_circleArr[i].equals(c)) {
				for (int j = i; j < _noOfCircles - 1; j++)
					_circleArr[j] = _circleArr[j + 1];
				_noOfCircles--;
				return true;
			}
		}
		return false;
	}


}
