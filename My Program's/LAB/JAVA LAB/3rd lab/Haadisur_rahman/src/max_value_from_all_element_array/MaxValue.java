package max_value_from_all_element_array;

public class MaxValue {

	public static void main(String[] args) 
	{

		int arr[]={1,3,5,6,7};
		
		for (int i = 0; i <5 ; i++) 
		{
			
		if ( arr[0] < arr[i] )
		{
		
			arr[0]=arr[i];
		}
		

	}
		System.out.println(arr[0]+" ");

	}
}
