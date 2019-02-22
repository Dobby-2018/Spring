package com.dobby.enrollment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dobby.enrollment.model.Student;

@Controller
@RequestMapping("/login")
public class StudentLoginController 
{
	
	@RequestMapping("/showForm")
	public String showLoginForm(Model model)
	{
		Student student=new Student();
		
		model.addAttribute("student",student);
		
		return "studentLogin-form";
	}
	
	@RequestMapping("/processLogin")
	public String processLoginForm(@ModelAttribute("student") Student student)
	{
		if(student.getUserName().equals("root")&&student.getPassword().equals("root"))
		{
			return "Student-homepage";
		}
		 
		else return "studentLogin-form";
	}

}
