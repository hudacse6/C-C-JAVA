package instance_variable;

public class InstanceVariable {

	public static class b
	{
		int i=10,j=12,k=14; 
		int b(int i,int j,int k)
		{
			
			i=i;
			j=j;
			k=k;
			System.out.println(i+j);
			return i;		
		}
	}

	public static void main(String[] args) 
	{
		b obj=new b();
		obj.b(3,2,1);
	}

}
