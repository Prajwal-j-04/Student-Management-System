package com.bezkoder.springjwt.dao;

import java.util.List;

import com.bezkoder.springjwt.models.Student;

public interface StudentDAO {

	boolean addStudentInDB(Student addStudent);

	boolean updateStudentInDB(Student updatedStudent);

	List<Student> getStudentDetails(int studentid);

}
