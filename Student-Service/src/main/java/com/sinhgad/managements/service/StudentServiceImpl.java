/**
 * 
 */
package com.sinhgad.managements.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinhgad.managements.dao.StudentRepositoy;
import com.sinhgad.managements.entity.Student;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepositoy studentRepository;
	
	@Override
	public Student registerNewStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetchAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public List<Student> fetchByTeacherId(int class_teacher_id) {
		// TODO Auto-generated method stub
		return studentRepository.findByTeacherId(class_teacher_id);
	}

	@Override
	public Optional<Student> findById(int student_id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(student_id);
	}

	@Override
	public Student updateStudentDetails(Student student) {
		Student existingStudent=studentRepository.findById(student.getStudent_id()).orElse(null);
		existingStudent.setStudent_name(student.getStudent_name());
		existingStudent.setClass_section(student.getClass_section());
		existingStudent.setClass_teacher_id(student.getClass_teacher_id());
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentDetailsById(int student_id) {
		studentRepository.deleteById(student_id);
		
	}
	

}
