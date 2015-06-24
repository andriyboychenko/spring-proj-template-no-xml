package org.andriy.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.andriy.spring.ejb.TestDiBean;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController{
	
	private static final Logger log = Logger.getLogger(MyController.class.getName());

	// Dependency injection
	@Autowired
	private TestDiBean testDiBean;
	 
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		ModelAndView model = new ModelAndView();
		model.addObject("message", "test");
		
		log.info("Dependency Injection message: "+testDiBean.testDI());
 
		return model;
	}
}