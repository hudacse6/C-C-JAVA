package print_1_to_10_in_asending_order;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		int n;
		int j;
		int i;
		Scanner aj =new Scanner(System.in);
	    System.out.printf("ff numbr:");
	    n=aj.nextInt();
		
		for (i = 2; i <n; i++) 
		{
			for ( j = 2; j <n; j++) 
			{
				if (i%j==0) 
				
				break;
			}
				
				if (i==j)
				{
					System.out.println(i);
				}
			}
		}

	}


