package com.raj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/welcome")
	public String getwelcomemessage() {
		String msg="Welcome to Rest API";
		return msg;
		
		
	}
	@GetMapping("/greet")
	public String getgreet(@RequestParam("name")String name) {
		String msg=name +"good morning";
		
		return msg;
	}

}
