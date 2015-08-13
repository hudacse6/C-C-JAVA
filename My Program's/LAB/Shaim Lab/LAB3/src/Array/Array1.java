package Array;


import java.util.Scanner;



public class Array1 {
	

public void addition()
{
	int i;
	int a[]=new int[10];
	int b[]=new int[10];
	int c[]=new int[10];
	Scanner sc = new Scanner(System.in);  
	System.out.println("first element:");
for( i=0;i<=2;i++)
{
	
	a[i]=sc.nextInt();
	
}
System.out.println("secound element:");
for(i=0;i<=2;i++)
{
	
	b[i]=sc.nextInt();
}
for(i=0;i<=2;i++)
{
	c[i]=a[i]+b[i];


	
	System.out.println("result:" +c[i]);
}
}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array1 obj = new Array1();
		obj.addition();
		
		
	}

}
