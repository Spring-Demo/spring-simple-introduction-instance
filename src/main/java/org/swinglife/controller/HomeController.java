package org.swinglife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home Controller
 * 
 * @author 	Lian
 * @date	2016年5月12日
 * @since	1.0	
 */
@Controller
public class HomeController {

	@RequestMapping("index")
	public String index() {
		return "home";
	}

	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
}
