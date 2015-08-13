class Animal{
	int x=4,y=7;
	void show(){
	System.out.println("x & y "+(x+y));
}
	}
class cow extends Animal{
	int a=5,b=2;
	void show1(){
	System.out.println("a & b "+(a+b));
	
}
	}
class murgi extends cow{
	int s=8,m=7;
	void show2(){
		System.out.println("s & m "+(s+m));
	}
}
class birds extends murgi{
	int r=15,t=5;
	void show3(){
		System.out.println("r & t "+(r/t));
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ob1=new Animal();
		birds ob2=new birds();
		ob2.show();
		ob2.show1();
		ob2.show2();
		ob2.show3();

	}

}
