package com.spring.employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HomeController {

	@RequestMapping("home.ss")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) {
		String name= req.getParameter("name");
		
		return new ModelAndView("success","msg",name);
	}

	
}
