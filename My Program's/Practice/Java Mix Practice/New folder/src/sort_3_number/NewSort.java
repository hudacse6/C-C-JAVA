package sort_3_number;

import java.util.Scanner;

public class NewSort 
{
public static class nsort{
	public static void shownsort()
	{

		int i,j,swap,n=3;
		Scanner sp=new Scanner(System.in);
		
		int a[]=new int[n];
		System.out.println("enter numbers:");
		for ( i = 0; i < n; i++) 
		{
			a[i]=sp.nextInt();//it,s says that let,s Input from keyboard until i>n
		}
		for ( i = 0; i < n-1; i++) 
		{
		for (j = 0; j <n-i-1; j++) //n-i-1 //here i=use in 1st loop 
		{
			if ( a[j] > a[j+1] ) 
			{
				swap=a[j];
				a[j]=a[j+1];
				a[j+1]=swap;
			}
		}	
		}
	System.out.println("Sorted list of numbers");
		
	for ( i = 0; i < n; i++) 
	{
		System.out.println(a[i]);	
	}

	
	}
}
	public static void main(String[] args) 
	{
		nsort obj=new nsort();
		obj.shownsort();
	}

}
