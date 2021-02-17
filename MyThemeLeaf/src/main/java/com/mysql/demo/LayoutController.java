package com.mysql.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {

	@GetMapping("/layout")
	public String lay()
	{
		return "index";
	}
}
