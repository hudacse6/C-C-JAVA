package fibonacci;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args)
	{

		int f=0,s=1,i,no,next;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the series number:");
		no=p.nextInt();
		for (i = 0; i < no; i++) 
		{
			if (i<=1) 
			{
				next=i;
			}
			else 
			{
				next=f+s;
				f=s;
				s=next;
				
			}
			System.out.print(next+" ");
		}

	}

}
