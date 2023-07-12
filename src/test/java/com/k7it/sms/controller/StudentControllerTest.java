package com.k7it.sms.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.k7it.sms.model.Student;
import com.k7it.sms.repository.StudentRepository;

public class StudentControllerTest {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Test
	void testCreateStudent() {
		Student student = new Student(1,"Giri","K",26);
		
		Student student1 = new Student(1,"Giri","K",26);

		assertEquals(1, student.getId());
		assertNotEquals(0, student.getId());
		
//		Student savedStudent = studentRepo.save(student);
//		assertNotNull(savedStudent);
		
	}
	
	@Test
	void testUpdateStudent() {
		int id=2;
		Student student = new Student(id,"Gowtham","K",26);
		student.setId(2);
		assertEquals("Gowtham",student.getFirstName());
		assertEquals(2,student.getId());
		
	}
	
	@Test
	void testGetStudents() {
		
		List<Student> students = new ArrayList<>();
		students.add (new Student(1,"Giri","K",26));
		students.add (new Student(2,"Gowtham","K",26));
		
		assertThat(students).size().isGreaterThan(0);
	}
	
    @Test
    void testDeleteStudent() {
    	int id=1;    	
    	boolean isExistBeforeDelete = studentRepo.findById(id).isPresent();
    	studentRepo.deleteById(id);
        boolean isExistAfterDelete = studentRepo.findById(id).isPresent();
        
        assertTrue(isExistBeforeDelete);
        assertFalse(isExistAfterDelete);
        
    }
    
}
