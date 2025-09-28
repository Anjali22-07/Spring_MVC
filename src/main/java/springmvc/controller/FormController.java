package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Form;
import springmvc.service.UserService;


@Controller
public class FormController {
	
	//Creating object of UserService class -- which sends the data from form to service  
	@Autowired
	private UserService userService;

	@RequestMapping("/Complex")
	public String ShowForm() {
		
		return "Complex_form";
	}
	
	@RequestMapping(path="/process" ,method= RequestMethod.POST)
	public String ProcessForm(@ModelAttribute("form") Form form) {
		
		System.out.println(form);
		
		this.userService.createForm(form);
		
		return "Done";
	}
	
	
}
