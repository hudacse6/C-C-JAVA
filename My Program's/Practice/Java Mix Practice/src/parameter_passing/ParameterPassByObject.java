package parameter_passing;


public class ParameterPassByObject 
{
	public static class b
	{
		 int b(int a,int b)//it,s constructor for same class name & method name.
		{
			
			int sum;
			sum=a+b;
			 System.out.println(sum);
			 return sum;
			
		}
	}

	public static void main(String[] args) 
	{
		b obj=new b();
		obj.b(3,3);
	}

}
