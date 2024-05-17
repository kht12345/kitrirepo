package springsecurity_xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/user")
	public String index(ModelMap model) {
		UserType userType = new UserType("사용자");
		model.addAttribute("user", userType.getType());
		return "index";
	}
	
	@GetMapping("/admin")
	public String admin(ModelMap model) {
		UserType userType = new UserType("관리자");
		model.addAttribute("user", userType.getType());
		return "admin";
	}
}
