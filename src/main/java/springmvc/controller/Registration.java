package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Registration {

	@RequestMapping("/Register")
	public String showForm() {
		
		return "Register";
	}
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email,
			@RequestParam("userName") String username,
			@RequestParam("userPassword") String password, Model model) {
		
		System.out.println("email"+email);
		System.out.println("UserName:"+username);
		System.out.println("Password:"+password);
		
		//sending data to view
		
		model.addAttribute("email", email);
		model.addAttribute("Name", username);
		model.addAttribute("password", password);
		return "Success";	
		}
}
