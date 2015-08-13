package Arraysum;

import java.util.Scanner;

	public class Array3 {
		

	public void addition()
	{
		int i,j,n,m;
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter row and colam:");
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		int c[][]=new int[n][m];
		 
		
		System.out.println("first element:");
	for( i=0;i<n;i++)
		for( j=0;j<m;j++)
		a[i][j]=sc.nextInt();
		

	System.out.println("secound element:");
	for(i=0;i<n;i++)
		for( j=0;j<m;j++)
		b[i][j]=sc.nextInt();
	
	for(i=0;i<n;i++)
		for( j=0;j<m;j++)
	
		c[i][j]=a[i][j]+b[i][j];

	
	
	for(i=0;i<=n;i++)
	{
		for( j=0;j<=m;j++)
	{
		
		System.out.print(+c[i][j]+ "\t");
	}
		System.out.println();	
		
	}
	}
		

		

		public static void main(String[] args) 
		{
			
			Array3 obj = new Array3();
			obj.addition();
			
			
		}

}