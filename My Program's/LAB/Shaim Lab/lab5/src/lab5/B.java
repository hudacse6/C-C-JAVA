package lab5;

public class B extends A  {
	int x,y;

	public B(int a, int b) {
		super(a, b);
		x=a;y=b;
	}
	public void Add()
	{
	int sum;
	sum=x+y;
	System.out.println("addition:"+sum);
	}
	

}
