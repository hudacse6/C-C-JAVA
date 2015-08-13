package grading_system_using_switch;

import java.util.Scanner;

public class CheckCgpa 
{
	public static class countcgpa
	{
		public static void countcgpatotal()
	
	
	{
	
		int marks,cgpa;
		Scanner sp=new Scanner(System.in);
		System.out.println("Enter total marks:");
		marks=sp.nextInt();
		cgpa=marks/10;
		switch (cgpa) 
		{
		case 10:
		case 9:
		case 8:
			System.out.println("4.00");
			break;
		case 7:
		case 6:
			System.out.println("3.50");
			break;
		case 5:
			System.out.println("3.00");
			break;
		case 4:
			System.out.println("2.00");
			break;

		default:
			System.out.println("Fail");
			break;
		}
	}
	}
	public static void main(String[] args) 
	{
		countcgpa obj=new countcgpa();
		obj.countcgpatotal();
		}

}
