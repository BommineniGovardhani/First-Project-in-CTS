package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
@RequestMapping("/hdfclogin1")
public String dispaly()
{
	return "callview";
	
}
@RequestMapping("/signin")
public String display2(Model m)
{
	m.addAttribute("myname","gova");
	return "view12";
}
}
