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
import com.sinhgad.managements.entity.Teacher;
import com.sinhgad.managements.service.TeacherServiceImpl;

@RestController
@RequestMapping("/api/teacher")
public class TeacherResource {

	@Autowired
	TeacherServiceImpl teacherServiceImpl;
	
	@PostMapping("/register/newteacher")
	public Teacher registerTeacher(@RequestBody Teacher teacher) {
		return teacherServiceImpl.registerTeacher(teacher);
	}
	
	@GetMapping("/fetchallteacher")
	public List<Teacher> fetchAllTeacherRecords() {
		return teacherServiceImpl.fetchAllTeacherRecords();
	}
	
	@PutMapping("/update/teacherrecord")
	public Teacher updateTeacherRecords(@RequestBody Teacher teacher) {
		return teacherServiceImpl.updateTeacherRecords(teacher);
	}
	
	@GetMapping("/fetchallstudents")
	public List<Student> fetchAllStudent(){
		return teacherServiceImpl.fetchAllStudent();
	}
	
	@PostMapping("/addnewstudent")
	public Student registerNewStudent(@RequestBody Student student) {
		return teacherServiceImpl.registerNewStudent(student);
	}
	
	@GetMapping("/filter/student/fetchbyteachertid/{class_teacher_id}")
	public List<Student> fetchByTeacherId(@PathVariable int class_teacher_id) {
		return teacherServiceImpl.fetchByTeacherId(class_teacher_id);
	}

	@GetMapping("/filter/student/{student_id}")
	public Optional<Student> findById(@PathVariable int student_id) {
		return teacherServiceImpl.findById(student_id);		
	}

	@PutMapping("/update/student")
	public Student updateStudentDetails(@RequestBody Student student) {
		return teacherServiceImpl.updateStudentDetails(student);	
	}

	@DeleteMapping("/deletestudent/{student_id}")
	public void deleteStudentDetailsById(@PathVariable int student_id) {
		 teacherServiceImpl.deleteStudentDetailsById(student_id);
	}
}
