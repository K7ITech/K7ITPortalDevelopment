package com.becoder.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.becoder.model.StudentDtls;
import com.becoder.service.StudentService;


@Controller
@RequestMapping
public class Homecontroller{
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/signin")
	public String login()
	{
		return "login";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	@GetMapping("/createStudent")
	public String createStudent()
	{
		System.out.println("createStudent method call");
		return "createStudent";
	}

	@PostMapping("/createStudent")
	public String createstudent(@ModelAttribute StudentDtls student) {
//		System.out.println(student);
		boolean f =studentService.checkEmail(student.getEmail());
		if(f)
		{
			System.out.println("Email id already Exist");
		} else {
			StudentDtls studentDtls=studentService.createStudent(student);
			{
			if(studentDtls != null)
			{
				System.out.println("Register successfully");
			}else {
				System.out.println("something error in server");
			}

		}
				return "redirect:/register";
	}
		return null;
}
}