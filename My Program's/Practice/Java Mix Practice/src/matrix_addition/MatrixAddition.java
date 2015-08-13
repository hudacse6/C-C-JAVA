package matrix_addition;

import java.util.Scanner;

public class MatrixAddition 
{

	 public static class addmatrix
		{
			public static void matrixaddition() 
			{
				
			      int c, d,i,j;
			      Scanner s = new Scanner(System.in);
			 
			      System.out.println("Enter the number of rows and columns u want:");
			      i = s.nextInt(); //i=row
			      j  = s.nextInt(); //j=column
			 
			      int a[][] = new int[i][j];
			      int b[][] = new int[i][j];
			      int sum[][] = new int[i][j];
			 
			      System.out.println("Enter the elements of a matrix");
			 
			      for (  c = 0 ; c < i ; c++ )
			         for ( d = 0 ; d < j ; d++ )
			            a[c][d] = s.nextInt();
			 
			      System.out.println("Enter the elements of b matrix");
			 
			      for ( c = 0 ; c < i ; c++ )
			         for ( d = 0 ; d < j ; d++ )
			            b[c][d] = s.nextInt();
			      
			      
			 
			      for ( c = 0 ; c < i; c++ )
			         for ( d = 0 ; d < j ; d++ )
			             sum[c][d] = a[c][d] + b[c][d];
			 
			      System.out.println("Sum of entered matrices:");
			 
			      for ( c = 0 ; c < i ; c++ )
			      {
			         for ( d = 0 ; d < j ; d++ )
			            System.out.print(sum[c][d]+" "); 
			         System.out.println();
			      }
			      
			   }
			}
		public static void main(String[] args) 
		{
			addmatrix obj=new addmatrix();
			obj.matrixaddition();
		}

}
