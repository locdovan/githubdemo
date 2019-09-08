package com.lopjava.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class HomeController {
	
	
	@GetMapping
	public String home( Model model) {
		
		
		return "home";
	}
	
	@PostMapping
	@ResponseBody
	public String nhanGiaTri(@RequestParam("username") String username,@RequestParam("text") String noiDung) {
		
		
		System.out.println("gia tri la :"+username+" vừa viết nội dung la :"+noiDung);
		// @RequestParam("username") String username hoàn toàn giống với String username=requesr.getparamer("usernmae");
		return "gia tri la :"+username+" vừa viết nội dung la :"+noiDung;
		
	}
	
}
