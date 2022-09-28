package com.bezkoder.springjwt.services;

import java.util.List;

import com.bezkoder.springjwt.models.Student;

public interface StudentService {

	boolean addStudentDetails(Student addStudent);

	boolean updateStudentDetails(Student updatedStudent);

	List<Student> getStudentDetails(int studentid);

}
