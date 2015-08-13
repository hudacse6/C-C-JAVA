package sort_3_number;

import java.util.Scanner;

public class Sort3Numbers 
{

	public static void main(String[] args) 
	{
		int i,j,swap,n;
		Scanner sp=new Scanner(System.in);
		System.out.println("enter number for sort:");
		n=sp.nextInt();
		int a[]=new int[n];
		System.out.println("enter numbers:");
		for ( i = 0; i < n; i++) 
		{
			a[i]=sp.nextInt();//it,s says that let,s Input from keyboard until i>n
		}
		for ( i = 0; i < n-1; i++) 
		{
		for (j = 0; j <n-j-1; j++) 
		{
			if ( a[j] > a[j+1] ) 
			{
				swap=a[j];
				a[j]=a[j+1];
				a[j+1]=swap;
			}
		}	
		}
		
	for ( i = 0; i < n; i++) 
	{
		System.out.println(a[i]+"sorts numbers:");	
	}
	
	}
}