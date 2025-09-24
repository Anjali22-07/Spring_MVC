package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;

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
		
//		System.out.println("email"+email);
//		System.out.println("UserName:"+username);
//		System.out.println("Password:"+password);
		
		//instead of writing each time we can map the values with the User class
		
		   User user= new User();
		   user.setEmail(email);
		   user.setUserName(username);
		   user.setPassword(password);
		   
	
		//sending data to view
		
		model.addAttribute("user",user);
		return "Success";	
		}
}
