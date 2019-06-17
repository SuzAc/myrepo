package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path="/hello")
	public ResponseEntity<String> getHello()
	{
		return ResponseEntity.ok("<html><body><b1>Hello Project</b1></body></html>");
	}

}
