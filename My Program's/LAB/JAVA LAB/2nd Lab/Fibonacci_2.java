package print_1_to_10_in_asending_order;

import java.util.Scanner;

public class Fibonacci_2 {

	public static void main(String[] args) 
	{

		int feb;
		int i;
		int n;
		
	    int s=1,f=0;
	    Scanner a=new Scanner(System.in);
	    System.out.printf("ff numbr:");
	    n=a.nextInt();
	    if(n==0){
	    	System.out.println("0");
	    }
	    if (n==1) {
	    	System.out.println("0,1");
			
		}
	    else {
			
		
	    for(i=0;i<n;i++)
            {

	        {
	         feb=f+s;
	         f=s;
	         s=feb;
	         if (feb>30) {
	        	 break;
				
			}
	        }
	     System.out.println(feb);
	    }

	    }
	

	}

}
