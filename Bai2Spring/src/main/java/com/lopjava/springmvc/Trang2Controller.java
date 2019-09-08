package com.lopjava.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/trang2")
public class Trang2Controller {
	
	@GetMapping
	public String defaul(@RequestParam("param1") String nd1 , @RequestParam("param2") String nd2) {
		System.out.println("noi dung 1 la :"+nd1+" noi dung 2 la :"+nd2);
		return "trang2";
	}

}
