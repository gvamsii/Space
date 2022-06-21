package com.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockDemoController {
	@GetMapping("/demo")
	public String demo() {
		return "hello docker this is for testing you";
	}

}
