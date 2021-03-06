package com.sinhgad.managements.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinhgad.managements.dao.TeacherDao;
import com.sinhgad.managements.entity.Student;
import com.sinhgad.managements.entity.Teacher;
@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherDao teacherDao;
	
	@Autowired
	StudentServiceProxy studentServiceProxy;
	
	@Override
	public Teacher registerTeacher(Teacher teacher) {
		return teacherDao.save(teacher);
	}
	
	@Override
	public List<Teacher> fetchAllTeacherRecords() {
		// TODO Auto-generated method stub
		return teacherDao.findAll();
	}
	
	@Override
	public Teacher updateTeacherRecords(Teacher teacher) {
		Teacher existingTeacherRecords=teacherDao.findById(teacher.getTeacher_id()).orElse(null);
		existingTeacherRecords.setTeacher_id(teacher.getTeacher_id());
		existingTeacherRecords.setTeacherName(teacher.getTeacherName());
		existingTeacherRecords.setDesignation(teacher.getDesignation());
		return teacherDao.save(teacher);
	}

	@Override
	public List<Student> fetchAllStudent() {
		
		return studentServiceProxy.fetchAllStudent();
	}

	@Override
	public Student registerNewStudent(Student student) {
		
		return studentServiceProxy.registerNewStudent(student);
	}

	@Override
	public List<Student> fetchByTeacherId(int class_teacher_id) {
		
		return studentServiceProxy.fetchByTeacherId(class_teacher_id);
	}

	@Override
	public Optional<Student> findById(int student_id) {
		
		return studentServiceProxy.findById(student_id);
	}

	@Override
	public Student updateStudentDetails(Student student) {
		
		return studentServiceProxy.updateStudentDetails(student);
	}

	@Override
	public void deleteStudentDetailsById(int student_id) {
		
		studentServiceProxy.deleteStudentDetailsById(student_id);
	}



	

}
