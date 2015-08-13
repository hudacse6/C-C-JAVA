package class_to_class;

public class ClassToClass {
	public static class add 
	{
		public static int  addition (int a,int b)
		{
			
			int c=a+b;
			System.out.println(c);
			return 0;
		}
	}

	public static void main(String[] args)
	{
		add obj=new add();
		obj.addition(5,0);
		
		

	}

}
