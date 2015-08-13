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
public class cls3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Animal ob1=new Animal();
murgi ob2=new murgi();
ob2.show();
ob2.show1();
ob2.show2();
	}

}
