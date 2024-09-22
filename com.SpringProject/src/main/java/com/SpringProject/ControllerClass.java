package com.SpringProject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@PostMapping("/greeting")
	public String getName(@RequestBody GenerateName request) {
		String res = request.getName();
		return "Hi " + res+"!";
		
	}
}
