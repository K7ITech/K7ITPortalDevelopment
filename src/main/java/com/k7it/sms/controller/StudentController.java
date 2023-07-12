package com.k7it.sms.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.k7it.sms.model.Student;
import com.k7it.sms.service.StudentService;

@RestController //SpringBoot Annotation
//@Controller //Spring Annotation
@RequestMapping("/api/v1")
public class StudentController {
	
	private static Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	// To invoke the simple java code from HTML code/JavaScript Code/Angular Code 
	//we need to use this Annotation called RestAPI/MicroSerices methods.
	//this Annotation connects simple java methods into a RestAPI/MicroSerices methods.
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		//call the service layer to get the student details
		logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Getting Student details>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		return studentService.getStudents();
	}
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		logger.info("<<<<<<<<<<<<<<<<<<<<<<Creating Student and coruse and address details into Databse:"+student+">>>>>>>");
		return studentService.createStudent(student);
		
	}
	
	@PutMapping("/student/{id}") //Dynamic parameter 2types. 1.Request 2.Path parameters
	                            //this is Path parameter
    public Student updateStudent(@RequestBody Student student, @PathVariable int id) {
		logger.info("<<<<<<<<<<<<<<<<<<<<<<updating Student details:"+student+">>>>>>>>>>>>>>>>>");
		return studentService.updateStudent(student, id);
		
	}
    
	@DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id) {
		logger.info("<<<<<<<<<<<<<<<<<<<<<<deleting Student details for student id:"+id+">>>>>>>>>>>>>>>>>>>>>>>");
    	studentService.deleteStudent(id);
		
	}


}
