package Arraysum;
import java.util.Scanner;



public class Array5 {

	public void big()
	{
		int i;
		int a[]=new int[30];
		
		Scanner sc = new Scanner(System.in);  
	
	for( i=0;i<6;i++)
	{
		
		a[i]=sc.nextInt();
		
	}
	
for(i=0;i<6;i++)
	{
	if(a[0]>a[i])
	{
		
		a[0]=a[i];
		
	}
		
		
	}
System.out.println("result:" +a[0]);
	}
		

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Array5 obj = new Array5();
			obj.big();
			
			
		}

	}



