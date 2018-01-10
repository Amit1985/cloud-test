package io.springbootquickstart.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudTestController {
	
	@RequestMapping("/sayHello")
	public String sayHello(){
		System.out.println("Good Morning..||!!!!");
		return "Hello.....";
	}

}
