package spring.springsecurity_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	@RequestMapping("/")
public String Home() {
	return "Home";
	
}
	@RequestMapping("/admin")
	public String Admin() {
		System.out.println("restricted");
		return "Admin";
	}
	

}
