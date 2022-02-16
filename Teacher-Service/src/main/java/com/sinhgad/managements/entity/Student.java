package com.sinhgad.managements.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {

	private int student_id;

	private String student_name;

	private String class_section;

	private int class_teacher_id;

}
