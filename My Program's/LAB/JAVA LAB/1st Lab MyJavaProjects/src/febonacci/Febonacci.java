package febonacci;

import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) 
	{
		 int febCount;
		 Scanner n=new Scanner(System.in);
		 
		 System.out.println("How much number do you want count by febonacci:");
		 febCount=n.nextInt();
		 int i;
         int feb[] = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for( i=2; i < febCount; i++)
         {
        	 feb[i] = feb[i-1] + feb[i-2];
         }

         for( i=0; i< febCount; i++)
         {
                 System.out.println(  " "+feb[i]);
         }
	}
}
