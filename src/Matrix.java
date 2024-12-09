/*
 *This code receives a two-dimensional array in which each cell has a
 * number between 0, which represents white, and 255, which
 * represents black, and arranges it in the form of a matrix that
 *displays an image
 */
public class Matrix {

	// Setting Variables
	int[][] matrixArray;
	private int black = 255;

	//A constructor that accepts the array and copies it
	public Matrix(int[][] array) {

		this.matrixArray = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				this.matrixArray[i][j] = array[i][j];
			}
		}

	}

	//A constructor that accepts the size of the array and contains it
	public Matrix(int size1, int size2) {
		matrixArray = new int[size1][size2];
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				matrixArray[i][j] = 0;
			}
		}
	}

	//A string method that prints the array in the form of a table
	public String toString() {
		String stringMatrix = "";
		int valueOfMatrix = 0;

		for (int i = 0; i < this.matrixArray.length; i++) {

			for (int j = 0; j < this.matrixArray[0].length; j++) {
				valueOfMatrix = matrixArray[i][j];

				stringMatrix += (valueOfMatrix + "\t");
			}
			stringMatrix += "\n";
		}

		return stringMatrix;
	}

	/*
	 * A method that returns the negative image of the array 
	 * (white will become black and so on for all shades)
	 */
	public Matrix makeNegative() {
		Matrix _makeNegative = new Matrix(this.matrixArray);

		for (int i = 0; i < this.matrixArray.length; i++) {
			for (int j = 0; j < this.matrixArray[0].length; j++) {
				_makeNegative.matrixArray[i][j] = black - matrixArray[i][j];

			}
		}
		return _makeNegative;
	}

	//A method that smooths the image and averages each cell
	public Matrix imageFilterAverage() {
		Matrix _imageFilter = new Matrix(this.matrixArray);
		for (int i = 0; i < this.matrixArray.length; i++) {
			for (int j = 0; j < this.matrixArray[0].length; j++) {
				_imageFilter.matrixArray[i][j] = filterAverageforOne(i, j);
			}

		}
		return _imageFilter;

	}

	//Private method associated with the imageFilterAverage class
	private int filterAverageforOne(int x, int y) {
		int numplus = 0;
		int sum = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (x + i >= 0 && x + i < this.matrixArray.length && y + j >= 0 && y + j < this.matrixArray[0].length) {
					numplus += this.matrixArray[i + x][j + y];
					sum++;
				}
			}
		}
		return numplus / sum;

	}

	//A method that rotates the image 90 degrees to the right clockwise
	public Matrix rotateClockwise() {
		Matrix rotateMatrix = new Matrix(this.matrixArray[0].length, this.matrixArray.length);
		for (int i = 0; i < rotateMatrix.matrixArray.length; i++) {
			for (int j = 0; j < rotateMatrix.matrixArray[i].length; j++) {
				rotateMatrix.matrixArray[i][j] = this.matrixArray[this.matrixArray.length - 1 - j][i];
			}
		}
		return rotateMatrix;
	}

	//A method that rotates the image 90 degrees to the left counterclockwise
	public Matrix rotateCounterClockwise() {
		Matrix rotateMatrixLeft = new Matrix(this.matrixArray[0].length, this.matrixArray.length);
		for (int i = 0; i < rotateMatrixLeft.matrixArray.length; i++) {
			for (int j = 0; j < rotateMatrixLeft.matrixArray[i].length; j++) {
				rotateMatrixLeft.matrixArray[i][j] = this.matrixArray[j][this.matrixArray[0].length - 1 - i];
			}
		}
		return rotateMatrixLeft;
	}

	//public static void main(String[] args) {
	//	int[][] array = { { 19, 124, 28, 35 }, { 115, 22, 25, 230 }, { 19, 21, 22, 249 }, { 0, 16, 9, 232 },
		//		{ 62, 35, 10, 116 } };
		//Matrix matrix = new Matrix(array);
		//System.out.println(matrix.toString());
		// matrix.makeNegative();
	//	System.out.println(matrix.rotateCounterClockwise());
//	}

}
