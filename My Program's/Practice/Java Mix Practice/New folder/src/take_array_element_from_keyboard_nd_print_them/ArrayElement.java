package take_array_element_from_keyboard_nd_print_them;

import java.util.Scanner;

public class ArrayElement 
{
	public static class arrelement{
		public static void showarrayelement(){
			int i,no;
			Scanner sp=new Scanner(System.in);
			System.out.println("Enter arrays:");
			no=sp.nextInt();
			int a[]=new int [no];
			System.out.println("Enter arrays elements:");
			for ( i = 0; i < no; i++) 
			{
				a[i]=sp.nextInt();
				
			}
			System.out.println("output arrays:");
			for ( i = 0; i < no; i++) 
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		
		arrelement obj=new arrelement();
		obj.showarrayelement();
	}

}
