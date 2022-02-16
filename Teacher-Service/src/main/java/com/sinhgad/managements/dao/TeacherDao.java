package com.sinhgad.managements.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinhgad.managements.entity.Teacher;
@Repository
public interface TeacherDao extends JpaRepository<Teacher,Integer> {

}
