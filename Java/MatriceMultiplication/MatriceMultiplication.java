package MatriceMultiplication;

import java.util.Scanner;

public class MatriceMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("Enter number of rows for A: ");
		int rowsA = sc.nextInt();
		
		System.out.print("Enter number of columns for A: ");
		int columnsA = sc.nextInt();
		
		System.out.print("Enter number of rows for B: ");
		int rowsB = sc.nextInt();
		
		System.out.print("Enter number of columns for B: ");
		int columnsB = sc.nextInt();
		
		
		
		
		int[][] A = new int[rowsA][columnsA];
		int[][] B = new int[rowsB][columnsB];
		
		// Product
		int[][] C = new int[rowsA][columnsB];
		
		System.out.println(" ");
		
		
		//Collect elements
		System.out.println("Enter elements row by row for A, seperated by spaces.");
		
		for (int i=0; i < rowsA; i++) {
			System.out.print("Row " + (i+1) +": ");
			for (int k = 0; k < columnsA; k++)
			{
				int element = sc.nextInt();
				A[i][k] = element;
				
			}
		}
		
		System.out.println("Enter elements row by row for B, seperated by spaces.");
		
		for (int i=0; i < rowsB; i++) {
			System.out.print("Row " + (i+1) +": ");
			for (int k = 0; k < columnsB; k++)
			{
				int element = sc.nextInt();
				B[i][k] = element;
			}
		}
		 
		
		System.out.println("Matrix A: ");
		
		for (int i=0; i<rowsA; i++)
		{
			System.out.println();
			System.out.print("|");
			for (int k=0; k<columnsA; k++)
				{System.out.printf("%4d", A[i][k]);}
			System.out.println("|");
		}
		
		System.out.printf("%n%n");
		
		System.out.println("Matrix B: ");
		
		for (int i=0; i<rowsB; i++)
		{
			System.out.println();
			System.out.print("|");
			for (int k=0; k<columnsB; k++)
				{System.out.printf("%4d", B[i][k]);}
			System.out.println("|");
		}
		
		
		//Compute matrix C:
		
		
		for (int i=0; i<rowsA; i++)
		{
			for (int j=0; j<columnsB; j++)
			{
				int sum = 0;
				for (int k=0; k< rowsB; k++)
				{
					sum += A[i][k]*B[k][j];
				}
				C[i][j] = sum;
				
			}
		}
		
		System.out.println();
		System.out.println("Answer: ");
		System.out.println("Resultant Matrix C: ");
		
		for (int i=0; i<rowsA; i++)
		{
			System.out.println();
			System.out.print("|");
			for (int k=0; k<columnsB; k++)
				{System.out.printf("%4d", C[i][k]);}
			System.out.println("|");
		}
		

	}

}

