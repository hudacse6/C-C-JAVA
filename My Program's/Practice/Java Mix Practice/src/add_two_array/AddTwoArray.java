package add_two_array;

import java.util.Scanner;

public class AddTwoArray 
{
public static class Additionwoarray 
{
	void showadditionary(){

		int a[]={1,5,5};
		int b[]={5,3,4};
		int c[]={2,5,1};
		int result=0;
		int result1=0;
		for (int i = 0; i < 3; i++)
		{
			result=a[i]+b[i];
			System.out.print(result  +" ");
		}
		for (int i = 0; i < 3; i++) {
			result1=result+c[i];
			System.out.print(result1+" "   );
		}
	
	}
}
	public static void main(String[] args)
	{
		Additionwoarray obj=new Additionwoarray ();
		obj.showadditionary();
	}

}
