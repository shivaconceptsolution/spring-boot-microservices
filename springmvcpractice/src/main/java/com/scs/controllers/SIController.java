package com.scs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SIController {
@GetMapping("siload")
public ModelAndView SiLoad()
{
	return new ModelAndView("siview","command",new SI());
}
@PostMapping("silogic")
public ModelAndView SiLogic(@ModelAttribute("springmvcpractice")SI s)
{
	float result = (s.getP()*s.getR()*s.getT())/100;
	ModelAndView obj= new ModelAndView("siview","command", new SI());
	obj.addObject("result","result is "+result);
	return obj;
}
}
