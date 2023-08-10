package com.becoder.service;

import com.becoder.model.StudentDtls;
public interface StudentService{
	
	public StudentDtls createStudent(StudentDtls student);
	public boolean checkEmail(String email);
	}
	