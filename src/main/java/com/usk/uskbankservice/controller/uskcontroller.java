package com.usk.uskbankservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class uskcontroller {
    @GetMapping("/getData")
	public String getData()
	{
		return "Git/GitHub";
		
	}
}
