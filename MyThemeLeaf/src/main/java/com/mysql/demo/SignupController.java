package com.mysql.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController
{
	@RequestMapping("/su")
	public String signup()
	{
		return "signup";
	}
	
	@PostMapping("/do_register")
	public String res(@RequestParam(value="agreement" ,defaultValue = "false") boolean agreement,
			          @RequestParam(value="name", defaultValue = "rohit") String name,
			          HttpSession session)
	{
		System.out.println(agreement);
		System.out.println(name);
		try 
		{
		if(!agreement)
		{
			throw new Exception("accept terms and condition "+name);
			
		}
		session.setAttribute("message", new User("resister successfull "+name,"hii"));
		return "signup";
		}
		catch (Exception e) {
			System.out.println(e);
			session.setAttribute("message", new User("do "+e.getMessage(),"hii"));
			return "signup";
		}
		
	}

}
