package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariableController {
	//Binding a uri template variable to a method parameter using name or value attribute of @pathVariable
	@RequestMapping("/path2/{name}/{age}")
	public ModelAndView disp(
			@PathVariable("name")String name1,
			@PathVariable("age")String age1)
	{
		ModelAndView m=new ModelAndView();
	m.addObject("msg","Name :"+name1+"====Age: "+age1);
	m.setViewName("PathParameter");
	return m;
	}
}
