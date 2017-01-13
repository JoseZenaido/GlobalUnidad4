package bootstrap.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/task")
	public String task(HttpServletRequest request){
		request.setAttribute("mode", "MODE_TASK");
		return "task";
	}
	@GetMapping("/cliente")
	public String cliente(HttpServletRequest request){
		request.setAttribute("mode", "MODE_CLIENTE");
		return "cliente";
	}
	
	@GetMapping("/film")
	public String film(HttpServletRequest request){
		request.setAttribute("mode", "MODE_FILM");
		return "film";
	}
	
	@GetMapping("/association")
	public String association(HttpServletRequest request){
		request.setAttribute("mode", "MODE_ASSOCIATION");
		return "association";
	}
	@GetMapping("/salary")
	public String salary(HttpServletRequest request){
		request.setAttribute("mode", "MODE_SALARY");
		return "salary";
	}
	@GetMapping("/author")
	public String author(HttpServletRequest request){
		request.setAttribute("mode", "MODE_AUTHOR");
		return "author";
	}
	
}
