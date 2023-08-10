package com.becoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.becoder.model.StudentDtls;
import com.becoder.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public StudentDtls createStudent(StudentDtls student) {
		
		return studentRepo.save(student);
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return studentRepo.existsByEmail(email);
	}
	
	
}	 
	
	
	
	

