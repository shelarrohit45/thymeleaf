package com.mysql.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResistrationController {

	@GetMapping("/employeeresistration")
	public String employeeresistration(Model model) //(@ModelAttribute("empobject") Employee emp)
	{
		Employee emp =new Employee();
		model.addAttribute("empobject", emp);
		return "employeeresistration";
	}
	
	@PostMapping("/empdata")
	public String empdata(Employee emp, RedirectAttributes ra)
	{
		System.out.println(emp.getName());
		ra.addFlashAttribute("saveemp", emp);
		
		return "redirect:/empdetails";
	}
	
	@GetMapping("/empdetails")
	public String showdata()
	{
		return "empdetails";
	}
}

