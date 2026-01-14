package com.scs.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.scs.models.Student;

@Controller
public class StudentController {
	@GetMapping("/student")
	 public ModelAndView StudentLoadForm()
	 {
		 return new ModelAndView("studentview","command",new Student());
	 }
	 @PostMapping("/studentinsert")
	 public ModelAndView StudentInsertData(@ModelAttribute("springmvcpractice")Student s)
	 {
		 Configuration cfg=new Configuration(); 
		 SessionFactory sf= cfg.configure().buildSessionFactory();
		 Session session= sf.openSession();
		 session.beginTransaction();
		 Student student = new Student();
		 student.setRno(s.getRno());
		 student.setSname(s.getSname());
		 student.setBranch(s.getBranch());
		 student.setFees(s.getFees());
		 session.save(student);
		 session.getTransaction().commit();
		 return new ModelAndView("studentview","command",new Student()).addObject("msg","Insert Successfully");
	 }
	 
	 @GetMapping("/viewstudent")
	 public ModelAndView ViewALLStudent()
	 {
		 Configuration cfg=new Configuration(); 
		 SessionFactory sf= cfg.configure().buildSessionFactory();
		 Session session= sf.openSession();
		 Query q = session.createQuery("from Student s");
		 List lst = q.list();
		 return new ModelAndView("studentlst","stulist",lst);
		 
	 }
	 
	 @GetMapping("/editstudent")
	 public ModelAndView findStudent(HttpServletRequest request)
	 {
		 Configuration cfg=new Configuration(); 
		 SessionFactory sf= cfg.configure().buildSessionFactory();
		 Session session= sf.openSession();
		 Student obj = session.load(Student.class,Integer.parseInt(request.getParameter("q")));
		 
		 return new ModelAndView("studentedit","command",obj);
		 
	 }
	 
	 @PostMapping("/studentupdate")
	 public ModelAndView StudentUpdateData(@ModelAttribute("springmvcpractice")Student s)
	 {
		 Configuration cfg=new Configuration(); 
		 SessionFactory sf= cfg.configure().buildSessionFactory();
		 Session session= sf.openSession();
		 session.beginTransaction();
		 Student student = new Student();
		 student.setRno(s.getRno());
		 student.setSname(s.getSname());
		 student.setBranch(s.getBranch());
		 student.setFees(s.getFees());
		 session.update(student);
		 session.getTransaction().commit();
		 return new ModelAndView("redirect:viewstudent");
	 }
	 @GetMapping("/deletestudent")
	 public ModelAndView deleteStudent(HttpServletRequest request)
	 {
		 Configuration cfg=new Configuration(); 
		 SessionFactory sf= cfg.configure().buildSessionFactory();
		 Session session= sf.openSession();
		 session.beginTransaction();
		 Student obj = session.load(Student.class,Integer.parseInt(request.getParameter("q")));
		 session.delete(obj);
		 session.getTransaction().commit();
		 return new ModelAndView("redirect:viewstudent");
		 
	 }
}
