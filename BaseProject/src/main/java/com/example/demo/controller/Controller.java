package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

	@GetMapping("/test")
	public String test() {
		return "Working Throught pipline..";
	}


    @GetMapping("/helloView")
    public ModelAndView helloView() {
        ModelAndView mav = new ModelAndView("hello"); // hello.html
        mav.addObject("name", "Amey");
        return mav;
    }
}
