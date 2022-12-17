package miniproject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class StudentOperation {
	List<Student>list=new ArrayList<Student>();
	public void addStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Address");
		String address=sc.next();
		
		Student s1=new Student(id,name,address);
		System.out.println("enter the another student data");
		System.out.println("Enter the id");
		int id1=sc.nextInt();
		System.out.println("Enter the Name");
		String name1=sc.next();
		System.out.println("Enter the Address");
		String address1=sc.next();
		
		Student s2=new Student(id1,name1,address1);
		list.add(s1);
		list.add(s2);
		list.forEach(System.out::println);
	}
	public void viewData()
	{
		Iterator<Student>it=list.iterator();
		while(it.hasNext())
		{
			Student s=(Student)it.next();
			System.out.println(s.getsId());
			System.out.println(s.getsName());
			System.out.println(s.getAddress());
			
		}
		
	}

}
