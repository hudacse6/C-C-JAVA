package fibonacci;

import java.util.Scanner;

class Fibonacci 
{
	public static class fb
	{
		void showfb()
		{
			int next,f=0,s=1,m,i,n;
			Scanner sp=new Scanner(System.in);
			System.out.println("kjcfi :");
			m=sp.nextInt();
			for ( i = 0; i < m; i++) 
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
				System.out.println(next+"");
				}
			
		
	}
	public static void main(String[] args)
	{

		fb obj=new fb();
		obj.showfb();

	}

	}
}
