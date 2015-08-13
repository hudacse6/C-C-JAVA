package Arraysum;

	import java.util.Scanner;




	public class Array2 {
		

	public void addition()
	{
		int i,j;
		Scanner sc = new Scanner(System.in); 
		
		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]=new int[4][4];
		 
		
		System.out.println("first element:");
	for( i=0;i<3;i++)
		for( j=0;j<3;j++)
		a[i][j]=sc.nextInt();
		

	System.out.println("secound element:");
	for(i=0;i<3;i++)
		for( j=0;j<3;j++)
		b[i][j]=sc.nextInt();
	
	for(i=0;i<3;i++)
		for( j=0;j<3;j++)
	
		c[i][j]=a[i][j]+b[i][j];

	
	
	for(i=0;i<3;i++){
		for( j=0;j<3;j++)
	{
		
		System.out.print(+c[i][j]+ "\t");
	}
		System.out.println();	}
	}
		

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Array2 obj = new Array2();
			obj.addition();
			
			
		}

}