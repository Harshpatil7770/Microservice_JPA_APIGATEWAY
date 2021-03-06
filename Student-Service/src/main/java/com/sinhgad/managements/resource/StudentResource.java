package com.sinhgad.managements.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinhgad.managements.entity.Student;
import com.sinhgad.managements.service.StudentServiceImpl;

@RequestMapping("/api/student")
@RestController
public class StudentResource {

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/registernewstudent")
	public Student registerNewStudent(@RequestBody Student student) {
		return studentServiceImpl.registerNewStudent(student);
	}
	
	@GetMapping("/fetchall")
	public List<Student> fetchAllStudent(){
		return studentServiceImpl.fetchAllStudent();
	}
	
	@GetMapping("/fetchall/{class_teacher_id}")
	public List<Student> fetchByTeacherId(@PathVariable int class_teacher_id){
		return studentServiceImpl.fetchByTeacherId(class_teacher_id);
	}
	
	@GetMapping("/fetch/{student_id}")
	public Optional<Student> findById(@PathVariable int student_id) {
		return studentServiceImpl.findById(student_id);
	}
	
	@PutMapping("/update/studentdetails")
	public Student updateStudentDetails(@RequestBody Student student) {
		return studentServiceImpl.updateStudentDetails(student);
	}
	
	@DeleteMapping("/delete/studentdetails/{student_id}")
	public void deleteStudentDetailsById(@PathVariable int student_id) {
		 studentServiceImpl.deleteStudentDetailsById(student_id);
	}
}
