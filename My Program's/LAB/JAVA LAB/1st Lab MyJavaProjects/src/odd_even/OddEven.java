package odd_even;

import java.util.Scanner;

public class OddEven {

		public static void main(String[] args) 
		{
			int a,b;
            Scanner n=new Scanner(System.in);
			a=n.nextInt();
			System.out.println("inpur 1st" + a);
			b=n.nextInt();
			System.out.println("input 2 "+b);
			
			if (a>b) 
			{
				System.out.println("a is large");
				
			}
			else
			{
				System.out.println("b is large");
			}
			
			

		}
	}

