package the_collatz_sequence;
import java.util.Scanner;

public class Main 
{
	public static class collatz
	{
		void collatz_sequence()
		{

			Scanner s = new Scanner(System.in);
			long a,b,x,t,p=1;
			while(true)
			{
				a = s.nextLong();
				b = s.nextLong();
				if( a<0 && b<0 )
					break;
				t = 1;
				x = a;
				for(;x!=1;)
				{
					if( x%2 == 0 )
						x = x/2;
					else 
						x = 3*x +1;
					if(x >b)
						break;
					t++;
				}
				System.out.println("Case "+p+": A = "+a+", limit = "+b+", number of terms = "+t);
				p++;
			}

		
		}
	}
	public static void main(String[] args)
	{
		collatz obj=new collatz();
		obj.collatz_sequence();
	}

}


