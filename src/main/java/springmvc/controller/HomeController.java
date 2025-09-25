package springmvc.controller;

import java.time.LocalDateTime;
import java.util.*;

/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	/*
	 * @Autowired private HomeService homeservice;
	 */
	
	@RequestMapping("/home")
	public String home(Model model){
		
		//sending data dynamically to jsp page 
		model.addAttribute("name","Anjali Singh");
		
		//to send a list of data
		List<String> friend =new ArrayList<>();
		friend.add("Sneha");
		 friend.add("Tanvi"); 
		 friend.add("Keshav"); 
		 friend.add("Yashasvee");
		model.addAttribute("f",friend);
		return "index";
		
	}
     
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page");
		
		  return "about";
		}
	
	//using ModelAndView object to send data to view
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help Controller");
		ModelAndView MAV= new ModelAndView();
		MAV.addObject("name","Anjali Singh");
		MAV.addObject("rollno",12345);
		LocalDateTime now=LocalDateTime.now();
		MAV.addObject("time",now);
		List<Integer> mark=new ArrayList<>();
		mark.add(123);
		mark.add(453);
		mark.add(1234);
		MAV.addObject("marks",mark);
		
		MAV.setViewName("help");
		
		return MAV;
		
	}
}
