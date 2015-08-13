package find_max_mini_in;

public class MaxMiniArray {

	public static void main(String[] args) 
	{
		int a[]={2,4,3,5,3,6,1};
		
		
		for (int i = 0; i < 7; i++) 
		{
 			if ( a[0] < a[i] ) 
			{
			
				a[0]=a[i];
			
				
			}
		
		}	System.out.println(a[0]);

	}

}
