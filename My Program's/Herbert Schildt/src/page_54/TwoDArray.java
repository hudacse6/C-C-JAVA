package page_54;

public class TwoDArray {

	public static void main(String args[])
	{
		int twod[][];
		twod=new int[3][4];
		int k=0;
		for (int i = 0; i <3; i++) 
		{
			for (int j = 0; j <4 ; j++) 
			{
				twod[i][i]=k;
				
				System.out.print(twod[i][j]+ " , " );//why output 0,0,0,0,5,0,0,0,0,10
				k++;
				if (twod[i][j]==10) 
				{
				break;	
				}
		
			}
			
				
		}
		
	}

}
