package merge_array;

import java.util.Arrays;

public class ArrayUtils
{

	public static void main(String[] args)
	{

		 int [] first = {1,2,3, 4};
	        int [] second = {5,6,7,8};
	      
	       
	        int [] combined = ArrayUtils.addAll(first, second);
	     
	        System.out.println("First array : " + Arrays.toString(first));
	        System.out.println("Second array : " + Arrays.toString(second));
	        System.out.println("Combined array : " + Arrays.toString(combined));

	

	}

	private static int[] addAll(int[] first, int[] second) {
		// TODO Auto-generated method stub
		return combined;
	}

}
