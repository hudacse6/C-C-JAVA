package page_53_array;

public class ArrayAverage {

	public static void main(String[] args) 
	{
		double nums[]={ 10.1 , 12.3 , 13.0 };
		double results=0;
		int i;
		for ( i = 0; i < 3; i++) 
		{
			results=results+nums[i];
			System.out.println("Average: "+results/5);
		}
		
	}

} 