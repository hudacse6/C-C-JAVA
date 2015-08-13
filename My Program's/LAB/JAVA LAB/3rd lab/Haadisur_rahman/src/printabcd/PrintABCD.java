package printabcd;

import java.util.Scanner;

public class PrintABCD {

	public static void main(String[] args) 
	{
		Scanner sp=new Scanner(System.in);
		String n;
		int arr[]=new int[5];
	
		for (int i = 0; i < 4; i++) 
		{
			n=sp.nextLine();
			
			
		}
		for ( int j = 0; j < 4; j++ ) 
		{
			System.out.print(arr[j]); 
			
			if (arr[j]<3) 
			{
				
			    System.out.print( ","); 
			}
         }
		
	
	}
}

