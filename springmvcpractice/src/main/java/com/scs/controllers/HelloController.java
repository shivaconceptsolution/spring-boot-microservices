package com.scs.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
 @GetMapping("/hello")
 public ModelAndView displayHello()
 {
	 return new ModelAndView("hello");
 }
}
