package mathAutomation;

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your equation values for a,b,c seperated by spaces (ax^2 + bx + c = 0): ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double squarePart = ( b*b - 4*a*c);
		
		
		System.out.printf("\n      " + b*-1 + " +/- √ %.2f%n ", squarePart);
		System.out.println("x = --------------------");
		System.out.println("           " + 2*a );
		
		
		double firstX = (b*-1 + Math.pow(squarePart, 0.5)) / (2*a);
		double secondX = (b*-1 - Math.pow(squarePart, 0.5)) / (2*a);
		
		System.out.printf("%n%nWhich comes out to: %.4f & %.4f" , firstX, secondX);
		

		sc.close();
	}

}
