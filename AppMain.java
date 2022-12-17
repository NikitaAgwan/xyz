package miniproject;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.View Student Data");
		System.out.println("2.insert STudent data");
		System.out.println("3.Update Student Data");
		System.out.println("4.Delete Student Data");
		do
		{
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("View");
					new StudentOperation().viewData();
					break;
				case 2:
					System.out.println("insert");
					new StudentOperation().addStudent();
					break;
				case 3:
					System.out.println("Update");
					break;
				case 4:
					System.out.println("Delete");
					break;
			
			}
			System.out.println("do u want to continue");
			s=sc.next();
		}
		while(s.equals("yes"));

	}


	}


