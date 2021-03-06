package com.sinhgad.managements.service;

import java.util.List;
import java.util.Optional;

import com.sinhgad.managements.entity.Student;

public interface StudentService {

	 Student registerNewStudent(Student student);
	 
	 List<Student> fetchAllStudent();
	 
	 List<Student> fetchByTeacherId(int class_teacher_id);
	 
	 Optional<Student>  findById(int student_id);
	 
	 Student updateStudentDetails(Student student);
	 
	 void deleteStudentDetailsById(int student_id);
}
