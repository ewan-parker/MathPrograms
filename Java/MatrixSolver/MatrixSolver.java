package MatrixSolver;

import java.util.Scanner;

public class MatrixSolver {
	
	// A helper method to find a valid pivot row:
	
	public static int findPivotRow(double[][] A, int startRow, int column) {
	
	
	
		for (int p = startRow; p < A.length; p++)
		{
			if (Math.abs(A[p][column]) > 0)
				return p;
		}
	return -1; // no pivot found...
	}
	
	
	
	// A helper method to swap rows:
	
	public static void swapRows(double[][] A, int r1, int r2) {
		
		for (int q = 0; q < A[0].length; q++)
		{
			double temp = A[r1][q];
			
			A[r1][q] = A[r2][q];
			
			A[r2][q] = temp;
		
		}
	}
	
	// A helper method to add rows together:
	
	public static void addRows(double[][] A, int targetRow, int usedRow, double factor) {
		
		for (int i = 0; i < A[0].length; i++)
		{
			A[targetRow][i] += ( factor * A[usedRow][i] );
		}
	}
	
	
	// A helper method to multiply a row:
	
	public static void multiplyRow(double[][] A, int targetRow, double factor) {
		
		for (int i = 0; i < A[0].length; i++)
		{
			A[targetRow][i] *= factor;
		}
	}
	
	
	
	// main:

	public static void main(String[] args) {
		
		//Open a Scanner to read user input.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter number of rows for A: ");
		int rowsA =  sc.nextInt();
		
		System.out.print("Enter number of columns for A: ");
		int columnsA = sc.nextInt();
		
		double[][] A = new double[rowsA][columnsA];
		
		
	
		
		
		for (int i = 0; i < rowsA; i++)
		{
			System.out.print("Enter values for row " + (i+1) + " seperated by spaces: ");
			for (int j = 0; j < columnsA; j++)
			{
				double element = sc.nextDouble();
				A[i][j] = element;
			}
		}
		
		System.out.print(" ");
		System.out.println("Your Matrix, A: ");
		
		
		for (int i=0; i<rowsA; i++)
		{
			System.out.println();
			System.out.print("|");
			
			for (int k=0; k<columnsA; k++)
				System.out.printf("%7.2f", A[i][k]);
			
			System.out.println("   |");
		}
		
		
		
		// perform calculations
		
		for (int column = 0, row = 0; column < A[0].length - 1 && row < A.length; column++)
		{
			
			
			int pivotRow = findPivotRow(A, row, column);	// Find the first nonzero entry in the first column
		
			
			if (pivotRow == -1)  // later on, fix this.
				continue;
			
			
			if (pivotRow != row)	//put the pivot row as row 1
				swapRows(A, row, pivotRow); 
			
			
			// normalizes the pivot row:
			
			double pivotValue = A[row][column];
			multiplyRow(A, row, 1.0 / pivotValue);
			
			
			// Makes the other entries in this column 0:
			
			for (int r = 0; r < A.length; r++)
			{
				if (r != row) 
				{
					double factor = -1 * A[r][column];
					addRows(A, r, row, factor);
				}
			}
			
			row++; // go to the next row, find the column 2 pivot, and repeat.
		}
			
		System.out.println(" ");
		System.out.println("The Guass-Jordan Eliminated Matrix, A: ");
		
		
		for (int i=0; i<rowsA; i++)
		{
			System.out.println();
			System.out.print("|");
			
			for (int k=0; k<columnsA; k++)
				System.out.printf("%7.2f", A[i][k]);
			
			System.out.println("   |");
		}
	}

}

