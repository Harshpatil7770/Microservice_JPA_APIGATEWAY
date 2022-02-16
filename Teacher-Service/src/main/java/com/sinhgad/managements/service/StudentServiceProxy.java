package com.sinhgad.managements.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sinhgad.managements.entity.Student;

@FeignClient(name="student-service")
public interface StudentServiceProxy {

	@GetMapping("/api/student/fetchall")
	public List<Student> fetchAllStudent();
	
	@PostMapping("/api/student/registernewstudent")
	public Student registerNewStudent(@RequestBody Student student); 
	
	
	@GetMapping("/api/student/fetchall/{class_teacher_id}")
	public List<Student> fetchByTeacherId(@PathVariable int class_teacher_id);
	
	@GetMapping("/api/student/fetch/{student_id}")
	public Optional<Student> findById(@PathVariable int student_id);
	
	@PutMapping("/api/student/update/studentdetails")
	public Student updateStudentDetails(@RequestBody Student student);
	
	@DeleteMapping("/api/student/delete/studentdetails/{student_id}")
	public void deleteStudentDetailsById(@PathVariable int student_id);
}
