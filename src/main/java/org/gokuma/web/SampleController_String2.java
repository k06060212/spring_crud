package org.gokuma.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController_String2 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController_String2.class);
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		
		
		
		logger.info("doC called...........");
		
		return "result";
	}
	
}
