package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class Registration {
	
	//creating object of UserService class
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void addCommonData(Model m) {
		
		m.addAttribute("Header", "Form Handling using Spring MVC");
		m.addAttribute("Desc", "ModelAttribute reduces the boilerplate");
	}

	@RequestMapping("/Register")
	public String showForm() {
		
		return "Register";
	}
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		 
		//@ModelAttribute bind the data from form to the object of class User 
		
		System.out.println(user);
		
		if(user.getUserName().isBlank()) {
			
			return "redirect:/Register";
		}
		
		//pass the user data received from form to the service layer
		
		this.userService.createUser(user);  //this sends user data to createuser method of UserService class
		
		//can create a service layer for the logic 
		return "redirect:/Register";	
		}
}
