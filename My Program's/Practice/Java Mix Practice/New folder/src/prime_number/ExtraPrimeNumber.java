package prime_number;
import java.util.Scanner;

public class ExtraPrimeNumber 
{
	public static class pnmbr{
		public static void showpnmbr(){

			
			int n;
			int j;
			int i;
			Scanner aj =new Scanner(System.in);
		    System.out.print("ENTER prime number numbr:");
		    n=aj.nextInt();
			
			for (i = 2; i <n; i++) 
			{
				for ( j = 2; j <n; j++) 
				{
					if (i%j==0) //if false then increase value of j.if true then it check (i==j).
					
					break;
				}
					
				if (i==j)
					{
						System.out.println("    prime Number    :" +i);
					}
					else 
					{
						System.out.println("Not prime number    :" +i);
					}
				}
			
		}
	}
	public static void main(String[] args) 
	{
		pnmbr obj=new pnmbr();
		obj.showpnmbr();
	}
}

