package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class TestController {
	@RequestMapping("/hello")
	public String HelloSpringmvc() {
		return "Hello";
	}
}