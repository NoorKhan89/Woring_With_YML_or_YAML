package in.vayam.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController
{
	@GetMapping("/")
	@ResponseBody
	public String MessagePrint()
{
	
	String s1= "Hello vayam";
	return s1 ;
}
}
