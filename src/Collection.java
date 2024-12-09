/*This program can receive up to 100 boxes
 * It is possible to add or remove a specific box
 * and run all kinds of methods on the boxes
 */
public class Collection {

	// Setting Variables
	private Box3D[] _boxes;
	private int _noOfBoxes;
	public final int MAX_NUM_BOXES = 100;

	//A constructor that resets the variables and defines the maximum size of the array
	public Collection() {
		_boxes = new Box3D[MAX_NUM_BOXES];
		_noOfBoxes = 0;
	}
	//A method that adds a box
	public boolean addBox(double x, double y, double z, int length, int width, int height) {
		if (_noOfBoxes == MAX_NUM_BOXES) {
			return false; 
		}

		Box3D newBox = new Box3D(x, y, z, length, width, height);
		int insertionIndex = 0;
		for (int i = 0; i < _noOfBoxes; i++) {
			if (newBox.getVolume() <= _boxes[i].getVolume()) {
				insertionIndex = i;
				break;
			}
		}
		
		for (int i = insertionIndex; i < _noOfBoxes; i++) {
			_boxes[i + 1] = _boxes[i];
		}
		
		_boxes[insertionIndex] = newBox;
		_noOfBoxes++;
		return true;
	}

	//A method that returns the base point of the highest box
	public Box3D mostUpperBaseCorner() {
		if (_noOfBoxes == 0) {
			return null;
		}
		double _UpperBase = _boxes[0].getBase().getY();
		Box3D result = _boxes[0];
		for (int i = 1; i < _noOfBoxes; i++) {

			if (_boxes[i].getBase().getY() > _UpperBase) {
				_UpperBase = _boxes[i].getBase().getY();
				result = _boxes[i];
			}

		}
		return (result);
	}

	//A method that returns the value of the entire surface area of all the boxes
	public double totalSurfaceArea() {
		double SurfaceArea = 0;
		for (int i = 0; i < _noOfBoxes; i++) {
			SurfaceArea += _boxes[i].getSurfaceArea();
		}
		return (SurfaceArea);
	}

	//A method that returns the distance between the farthest boxes
	public double longestDistance() {
		if (_noOfBoxes < 2) {
			return 0;
		}
		double theHighest = _boxes[0].distance(_boxes[1]);
		double result = 0;
		for (int i = 1; i < _noOfBoxes; i++) {
			for (int j = i + 1; j < _noOfBoxes; j++) {

				theHighest = _boxes[i].distance(_boxes[j]);
				if (theHighest > result) {
					result = theHighest;
				}
			}
		}
		return result;
	}

	//A method that receives a box and returns the number of boxes that go into it
	public int howManyContains(Box3D p) {
		int numBoxes = 0;

		for (int i = 0; i < _noOfBoxes; i++) {
			if (_boxes[i].contains(p))
				numBoxes++;
		}
		return numBoxes;
	}

	//A method that accepts two variables and returns the volume of the box can contain all the boxes between the two variables
	public double volumeOfSmallestBox(int i, int j) {

		double volumeOfBox = 0;

		if (i > 100 || j > 100 || i < 0 || j < 0) {
			return 0;
		}

		for (int _i = i; _i < j; _i++) {

			if (_boxes[_i].getVolume() > volumeOfBox) {
				volumeOfBox = _boxes[_i].getVolume();
			}
		}
		return volumeOfBox;
	}

	//A method that copies the array and returns it again
	public Box3D[] getBoxes() {
		Box3D[] boxesCopy = new Box3D[_noOfBoxes];
		for (int i = 0; i < _noOfBoxes; i++) {
			boxesCopy[i] = _boxes[i];
		}
		return boxesCopy;
	}

	//A method that returns the number of boxes in the array
	public int getNumOfBoxes() {

		return _noOfBoxes;

	}

	//A method that returns the data of all boxes in a string
	public String toString() {
		String _String = "";
		for (int i = 0; i < _noOfBoxes; i++) {
			_String += "Box no. " + (i + 1) + ": The base point is " + _boxes[i].getBase() + ", length = "
					+ _boxes[i].getLength() + ", width = " + _boxes[i].getWidth() + ", height = "
					+ _boxes[i].getHeight() + '\n';

		}
		return _String;
	}

}
