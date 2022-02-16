package com.sinhgad.managements.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinhgad.managements.entity.Student;
@Repository
public interface StudentRepositoy extends JpaRepository<Student,Integer>{

	@Query(value="select * from student where class_teacher_id=?",nativeQuery=true)
	List<Student> findByTeacherId(int class_teacher_id);

}
