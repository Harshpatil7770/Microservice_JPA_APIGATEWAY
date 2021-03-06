package com.sinhgad.managements.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sinhgad.managements.entity.Student;
import com.sinhgad.managements.entity.Teacher;

public interface TeacherService {

	Teacher registerTeacher(Teacher teacher);
	
	List<Teacher> fetchAllTeacherRecords();

	Teacher updateTeacherRecords(Teacher teacher);
	// ----------------------------------------------------------//

	List<Student> fetchAllStudent();

	Student registerNewStudent(Student student);

	List<Student> fetchByTeacherId(int class_teacher_id);

	Optional<Student> findById(int student_id);

	Student updateStudentDetails(Student student);

	void deleteStudentDetailsById(int student_id);
}
