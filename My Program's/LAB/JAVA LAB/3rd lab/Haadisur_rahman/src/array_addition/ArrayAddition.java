package array_addition;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) 
	{
		
		Scanner sp=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		int i,j,k,sum=0,sumfinal=0,total;
		System.out.println("Enter array a:");
		for ( i = 0; i < 5; i++)
		{
			a[i]=sp.nextInt();
			
			
		}
		System.out.println("Enter array b:");
		for ( j = 0; j < 5; j++)
		{
			b[j]=sp.nextInt();
			
			
		}
		System.out.println("Total:");
		for ( k = 0; k < 5; k++)
		{
			c[k]=a[i]+b[j];
			System.out.println(c[k]+ "");
			
			
			
		}



	}

}
