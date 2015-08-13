package fib0nacci_2;



	import java.util.Scanner;

	public class Fibonacci2 {

		public static void main(String[] args) 
		{

			int feb;
			int i;
			int n;
			
		    int s=1,f=0;
		    Scanner a=new Scanner(System.in);
		    System.out.print("ff numbr:");
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
		         
		        }
		     System.out.println(feb);
		    }

		    }
		

		}

	}
