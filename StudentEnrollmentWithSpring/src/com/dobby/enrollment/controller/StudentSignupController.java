package com.dobby.enrollment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dobby.enrollment.model.Student;

@Controller
@RequestMapping("/signup")
public class StudentSignupController
{
	private Student student;
	
	@RequestMapping("/showForm")
	public String showSignupForm(Model model)
	{
		student=new Student();
		
		model.addAttribute("student",student);
		
		return "studentReg-form";
	}
	
	
	@RequestMapping("/processSignup")
	public String processSignupForm(@ModelAttribute("student") Student student)
	{
		//need to validate the data and process
		
		return "studentLogin-form";
	}
}
