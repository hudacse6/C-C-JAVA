package prime_number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int i,ans,n;
		Scanner sp=new Scanner(System.in);
		System.out.println("enter number for PRIME:");
		n=sp.nextInt();
		for ( i = 2; i<=n/2; i++) 
		{
			ans=n%2;
			if (ans==0) 
			{
				System.out.println("not prime number");
				break;
		
			}
		}
	
		System.out.println(" PRIME number:");

	}

}
