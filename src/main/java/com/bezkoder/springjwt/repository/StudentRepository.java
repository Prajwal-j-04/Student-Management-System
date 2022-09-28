package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
