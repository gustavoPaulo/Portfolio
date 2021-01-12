package com.portfoliojava.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/portfolio")
public class PortfolioResource {
	
	private static final String INDEX_VIEW = "index";
	

	@GetMapping
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView(INDEX_VIEW);
		return mv;
	}
}
