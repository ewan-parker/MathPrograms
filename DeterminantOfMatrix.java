package mathAutomation;

import java.util.Scanner;
public class DeterminantOfMatrix {

	
	public static double[][] MatrixInput() {
		
		Scanner sc = new Scanner(System.in);
		int size = -1;
		
		
		//Determine size of the matrix, validate input.
		while(true) {
			System.out.print("Enter the size of the square matrix (n, where the size is n by n): ");
			
			if (sc.hasNextInt()) {
				size = sc.nextInt();
			
				if (size > 0) {
					break;
				} else {
					System.out.println("Size must be a positive integer.");
				}

				
			} else {
				System.out.println("Invalid, Please enter a integer.");
				sc.next();
			}
			
			
		}
		
		double[][] A = new double[size][size];
		
		
		
		//Collect elements
		System.out.printf("Enter elements row by row for A, separated by spaces.%n%n");
		
		for (int i=0; i < size; i++) {
			System.out.print("Row " + (i+1) +": ");
			for (int k = 0; k < size; k++)
			{
				double element = sc.nextInt();
				A[i][k] = element;
				
			}
		}
		
		return A;
			
	}
	
	public static double findDeterminant(double[][] A) {
		
		int n = A.length;
		
		//Base case: 1x1 matrix.
		
		if (n == 1)
			return A[0][0];
		
		//Base case: 2x2 matrix
		if (n == 2) 
			return A[0][0] * A[1][1] - A[0][1] * A[1][0];
		
		//Base case: 3x3 matrix
		if (n == 3) {
			return  A[0][0]*A[1][1]*A[2][2] + A[0][1]*A[1][2]*A[2][0] + A[0][2]*A[1][0]*A[2][1] 
					- (A[0][2]*A[1][1]*A[2][0] + A[0][0]*A[1][2]*A[2][1] + A[0][1]*A[1][0]*A[2][2]);
		}
		
		
		
		return -1;
		
	}
	
	
	
	
	public static void main(String[] args) {
		

		double[][] A = MatrixInput();
		
		
		//Print the board:
		
		System.out.println("Your matrix, A:");
		for (int i=0; i<A.length; i++)
		{
			System.out.println();
			System.out.print("|");
			
			for (int k=0; k<A.length; k++)
				System.out.printf("%7.2f", A[i][k]);
			
			System.out.println("   |");
		}
		
		
		double det = findDeterminant(A);
		
		if (det == -1) {
			System.out.println(" ");
			System.out.print("Whoops, currently only works for matrices of size n < 4");
		}
		else {
			System.out.printf("%nThe Determinant of your matrix A: %f", det);
		}

	}

}
