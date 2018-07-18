package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping(value = "/log", method = RequestMethod.GET)
	@ResponseBody
	public String helloString() {
		return "hello controller";
	}
}
