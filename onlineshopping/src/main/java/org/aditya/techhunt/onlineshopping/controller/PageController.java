package org.aditya.techhunt.onlineshopping.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Welcome to web mvc" );
		
		return mv;
	}
	
	@RequestMapping(value= {"/test"})
	public ModelAndView test(@RequestParam(value="greeting",defaultValue="Hello All") String greeting) {
		if (greeting==null) {
			greeting="Hello There";
		}
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", greeting );
		
		return mv;
	}
	
	
}
