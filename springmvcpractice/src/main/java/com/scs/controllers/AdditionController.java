package com.scs.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
@GetMapping("/addition")
public ModelAndView AdditionView()
{
	return new ModelAndView("addview");
}
@PostMapping("/additioncode")
public ModelAndView AdditionCode(HttpServletRequest request)
{
	int a = Integer.parseInt(request.getParameter("num1"));
	int b = Integer.parseInt(request.getParameter("num2"));
	int c = a+b;
	return new ModelAndView("addview","result","result is "+c);
}
}
