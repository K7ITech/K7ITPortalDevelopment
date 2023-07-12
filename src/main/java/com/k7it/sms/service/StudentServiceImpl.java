package com.k7it.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.k7it.sms.exception.InvalidAgeException;
import com.k7it.sms.model.Student;
import com.k7it.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> getStudents() 
	{
	Iterable<Student> it = studentRepo.findAll();
		List<Student> studentList  =  new ArrayList<>();
		it.forEach(student ->  studentList.add(student));
		
		return studentList;
	}

	@Transactional
	@Override
	public Student createStudent(Student student) {
		// validation 
		boolean isValidStudent = validateStudentDetails(student); 
		if(isValidStudent) {
		return studentRepo.save(student);
		}else {
			throw new RuntimeException("Student Detials are not correct please provide proper detials");
		}
	}

	boolean validateStudentDetails(Student student) {
		boolean flag = true;
		if(student.getFirstName() == null || student.getFirstName().isEmpty()) {
			 flag  = false;
			 throw new IllegalArgumentException("Student First name should not be empty");
		}
		if(student.getLastName() == null || student.getLastName().isEmpty()) {
			 flag = false;
			 throw new IllegalArgumentException("Student LastName should not be empty");
		}
		if(student.getAge() < 0 ||  student.getAge() > 100 ) {
			 flag = false;
			 throw new InvalidAgeException("Student age should be between 0 to 100");
		}
		return flag;
	}
	
	@Transactional
	@Override
	public Student updateStudent(Student student, int id) {
		return studentRepo.save(student);
	}

	@Transactional
	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		
	}

}
