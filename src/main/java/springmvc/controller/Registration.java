package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

@Controller
public class Registration {
	
	
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
		
		//can create a service layer for the logic 
		return "Success";	
		}
}
