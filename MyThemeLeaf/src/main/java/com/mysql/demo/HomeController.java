package com.mysql.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showdata(Model model)
	{
		Employee emp=new Employee();
		emp.setName("rohit");
		emp.setRoll(101);
		model.addAttribute("myemp",emp);
		return "home";
	}
	
	@GetMapping("/contact")
	public String contact(Model model)
	{
		model.addAttribute("id",45);
		return "contact";
	}
	
	@ResponseBody
	@GetMapping("/emp/{eid}")
	public String emp(@PathVariable("eid") int roll)
	{
		return "your employee: "+roll;
	}
	
	@ResponseBody
	@GetMapping("/emp")
	public String emp1(@RequestParam("id") int roll)
	{
		return "your employee: "+roll;
	}	
	
	@GetMapping("/message")
	public String mesaage()
	{
		return "message";
	}
	
	@GetMapping("/conditional")
	public String conditional(Model model)
	{
		Employee emp=new Employee();
		emp.setName("Shreya");
		emp.setRoll(25);
		emp.setSalary(25000);
		
		model.addAttribute("shreyadata",emp);
		return "conditional";
	}
	
	@GetMapping("/switchcondition")
	public String switchcondition(Model model)
	{
		Employee emp=new Employee();
		emp.setName("rohit");
		model.addAttribute("shreyadata",emp);
		return "switchcondition";
	}
	
	@GetMapping("/LoopingIterator")
	public String LoopingIterator(Model model)
	{
		List<Employee> emp=Arrays.asList(
				new Employee("rohit",101,25000),
				new Employee("rohan",102,35000),
				new Employee("sangram",103,40000),
				new Employee("shreya",104,45000)
				);
		model.addAttribute("emp",emp);
		return "LoopingIterator";
	}
	
	
}
