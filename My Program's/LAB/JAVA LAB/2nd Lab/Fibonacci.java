package print_1_to_10_in_asending_order;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		int feb;
		int i;
		int n;
		
	    int s=1,f=0;
	    Scanner a=new Scanner(System.in);
	    System.out.printf("ff numbr:");
	    n=a.nextInt();
	    
	    for(i=0;i<n;i++)
     {	            if(i<=1)
	        {
	           feb=i;
	        }
	     else
	        {
	         feb=f+s;
	         f=s;
	         s=feb;
	        }
	     System.out.println(feb);
	    }


	}
}


