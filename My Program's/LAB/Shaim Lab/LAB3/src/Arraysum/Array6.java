package Arraysum;

import java.util.Scanner;



public class Array6 {
	public void show()
	{
		int i;
		String a[]=new String[10];
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("enter string:");
	for( i=0;i<=3;i++)
	{
		
		a[i]=sc.nextLine();
		
	}
	
	for(i=0;i<=3;i++)
	{
		
		System.out.print(a[i]+"");
		if(i<3)
		{
			System.out.print(",");
		}
	
		
	}

		
		
		
	
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array6 obj = new Array6();
		obj.show();
	}

}
