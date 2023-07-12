package com.k7it.sms.service;

import java.util.List;

import com.k7it.sms.model.Student;

public interface StudentService {
	
	public List<Student> getStudents();

	public Student createStudent(Student student);

	public Student updateStudent(Student student, int id);

	public void deleteStudent(int id);


}
