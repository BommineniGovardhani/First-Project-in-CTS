package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControler {
@RequestMapping(value="/checkaccount",method=RequestMethod.POST)
public String display(
		@RequestParam("user1")
		String username,
		@RequestParam("pass")
		String password,
		Model m
		
		
		)
{
	if(username.equals("gova"))
	{
		String msg="Hello   "+username;
	m.addAttribute("message",msg);
	return "successpage";
	}
	else
	{
		String msg="sorry! Invalid"+username;
		m.addAttribute("message1",msg);
		return "errorpage";
	}
}

}
