class B{
	void add(int x,int y){
		
		System.out.println("\n x & y "+(x+y));
	}
	void add(double x,double y){
		System.out.println("\n x & y "+(x+y));
	}
}
public class cls2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1=new B();
		ob1.add(9,8);
		ob1.add(3.5,7.5);

	}

}
