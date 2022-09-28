package com.bezkoder.springjwt;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bezkoder.springjwt.models.Student;
import com.bezkoder.springjwt.services.StudentService;
import com.bezkoder.springjwt.services.StudentServiceImplementation;


@SpringBootApplication
public class SpringBootSecurityJwtApplication implements CommandLineRunner{

	public static void main(String[] args) {
    SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
    System.out.println(1);
	
	}

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Add Student
//		Student addStudent = new Student("M", 102, 1996, 961147627, "m@gmail.com", "MEE" );
//		
//		boolean added = studentService.addStudentDetails(addStudent);
//		
//		if(added)
//		{
//			System.out.println("Student added successfully");
//		}
//		else
//			System.out.println("Student not added");
		
		
		//Update Student
//		Student updatedStudent = new Student("PJ", 6, 1999, 123578904, "prajwal@gmail.com", "ece" );
//		
//		boolean updated = studentService.updateStudentDetails(updatedStudent);
//		
//		if(updated)
//		{
//			System.out.println("Student details updated successfully");
//		}
//		else
//			System.out.println("Student details not updated");
		
		
		//Get Student Details via StudentId
//		int studentid = 1;
//		List<Student> students = studentService.getStudentDetails(studentid);
//		if(students.size()==0)
//		{
//			System.out.println("No Student found");
//		}
//		else
//		{
//			System.out.println("Student found");
//			for(Student s : students)
//			{
//				System.out.println(s.getStudentname() + " " + s.getStudentid() + " " + s.getEmail() + " " + 
//						s.getMobileno() + " " + s.getEmail() + " " + s.getStream());
//				
//			}
//		}
//	}
		
	}
}
	
	