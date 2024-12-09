/*The algorithm receives two equations
 * in two vanishings and the system prints
 * the equations and knows how to give
 * three possible answers
 * 1 "Single solution"
 * 2 "No solution"
 * 3 "Many solutions"
 */

import java.util.Scanner;

public class Equations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("This program solves a system of 2 linear equations " + '\n'
				+ "Enter the coefficients a11 a12 a21 a22 b1 b2");

//We will put all the values into the variables
		double a11 = scan.nextInt();
		double a12 = scan.nextInt();
		double a21 = scan.nextInt();
		double a22 = scan.nextInt();
		double b1 = scan.nextInt();
		double b2 = scan.nextInt();
		System.out.println("Eq1: " + a11 + "*x1+" + a12 + "*x2=" + b1);
		System.out.println("Eq2: " + a21 + "*x1+" + a22 + "*x2=" + b2);
//This is the exercise that calculates the equations

		if (a11 != 0) {
			b1 /= a11;
			a12 /= a11;
		}

		double x = a21 * b1 - b2;

		double y = a21 * a12 - a22;

//We will find the value of Y		
		y = x / y;
//We will find the value of X				
		x = b1 - a12 * y;

//Round to three digits after the point by the conversion command	    
		String x_3 = String.format("%.3f", x);
		String y_3 = String.format("%.3f", y);

//This is in the case of "Single solution"	    
		if ((a11 * a22) - (a12 * a21) != 0)
			System.out.print("Single solution:(" + x_3 + "," + y_3 + ")");

//This is in the case of "No solution"	    

		else if (((b2 * a11 - b1 * a21) == 0) && ((b1 * a22 - b2 * a12) == 0) && (a11 != 0 && a12 != 0 && b2 == 0)
				|| (a21 != 0 && a22 != 0 && b1 == 0))
			System.out.println("Many solutions");
//This is in the case of "Many solutions"  
		else
			System.out.println("No solution");

	}
}
