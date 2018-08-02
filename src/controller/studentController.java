package controller;

import java.util.Scanner;

import service.IStudentService;
import service.StudentServiceImpl;
import dto.Student;

public class studentController {

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("eNETR NAME");
		String name=sc.next();
		s.setName(name);
		System.out.println("enter id");
		int id=sc.nextInt();
		s.setId(id);
		System.out.println("Enter marks");
		double marks=sc.nextDouble();
		s.setMarks(marks);
		IStudentService service=new StudentServiceImpl();
		service.addNew(s);
	}

}
