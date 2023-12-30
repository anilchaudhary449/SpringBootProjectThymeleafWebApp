package com.anil.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorldController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("Message","Hello World");
		return "helloworld";
	}

}
