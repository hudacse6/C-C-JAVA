package sum_two_array;

import java.util.Scanner;

public class SumTwoArray {

	public static void main(String[] args)
	{
		   int c, d,i,j;
		      Scanner s = new Scanner(System.in);
		 
		      System.out.println("Enter the number of rows and columns u want:");
		      i = s.nextInt(); //i=row
		      j  = s.nextInt(); //j=column
		 
		      int a[][] = new int[i][j];
		      int b[][] = new int[i][j];
		      int sum[][] = new int[i][j];
		      int anotherarray[][]=new int[i][j];
		      int sumanotherarray[][]=new int[i][j];
		 
		      System.out.println("Enter the elements of first array");
		 
		      for (  c = 0 ; c < i ; c++ )
		         for ( d = 0 ; d < j ; d++ )
		            a[c][d] = s.nextInt();
		 
		      System.out.println("Enter the elements of second array");
		 
		      for ( c = 0 ; c < i ; c++ )
		         for ( d = 0 ; d < j ; d++ )
		            b[c][d] = s.nextInt();
		      
		      System.out.println("The Addition of first and second array:");
		 
		      for ( c = 0 ; c < i; c++ )
		      {
		         for ( d = 0 ; d < j ; d++ )
		         {
		             sum[c][d] = a[c][d] + b[c][d];
		             System.out.print(sum[c][d]+" "); 
		         }
		         System.out.println();
		      }
		      
		      System.out.println("The another array is:"); 
		      for ( c = 0; c < i; c++) 
		     
				for ( d = 0; d <j; d++) 
				
					anotherarray[c][d]=s.nextInt();
		      System.out.println("The sum of two array and assigning to anoither one:"); 
		      
		      for ( c = 0; c < i; c++){ 
				     
					for ( d = 0; d <j; d++)
					{
						sumanotherarray[c][d]=anotherarray[c][d]+sum[c][d];
						 System.out.print(sumanotherarray[c][d]+" "); 
					}
					
			}
		 
		  
	
	}
	}



