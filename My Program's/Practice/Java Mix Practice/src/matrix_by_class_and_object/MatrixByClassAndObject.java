package matrix_by_class_and_object;

import java.util.Scanner;

public class MatrixByClassAndObject 
{

	public static class add{

		public static void addi()
		{
			
		int a [] [] =new int [3][3];
		int b [] [] =new int [3][3];
		int c [] [] =new int [3][3];
		Scanner s = new Scanner(System.in) ;
		for(int i=0;i<=2;i++)
		{
		for(int j=0;j<=2;i++)
		{
		a[i][j]=s.nextInt();
		}
		}
		for(int i=0;i<=2;i++)
		{
		for(int j=0;j<=2;i++)
		{
		b [i] [j] =s.nextInt();
		}
		}
		for(int i=0;i<=2;i++)
		{
		for(int j=0;j<=2;i++)
		{
		c[i][j] =a[i][j]+b[i][j];
		}
		}
		for(int i=0;i<=2;i++)
		{
		for(int j=0;j<=2;i++)
		{
		System.out.print(c[i][j]+" ");
		}
		System.out.println(); }
		}
		
	}

		public static void main(String[] args) 
		{
	
		add obj=new add();
		obj.addi();
		}
	}

