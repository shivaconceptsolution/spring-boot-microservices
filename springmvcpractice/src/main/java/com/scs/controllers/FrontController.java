package com.scs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	@GetMapping("/")
	 public ModelAndView home()
	 {
		 return new ModelAndView("home");
	 }
	@GetMapping("/about")
	 public ModelAndView about()
	 {
		 return new ModelAndView("about");
	 }
	@GetMapping("/services")
	 public ModelAndView services()
	 {
		 return new ModelAndView("services");
	 }
	@GetMapping("/gallery")
	 public ModelAndView gallery()
	 {
		 return new ModelAndView("gallery");
	 }
	@GetMapping("/contact")
	 public ModelAndView contactus()
	 {
		 return new ModelAndView("contactus");
	 }
}
