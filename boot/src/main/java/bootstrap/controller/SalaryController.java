package bootstrap.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bootstrap.model.Salary;
import bootstrap.service.SalaryService;

@Controller
public class SalaryController {
	@Autowired
	private SalaryService salaryService;
	
	@GetMapping("/all-salaries")
	public String allSalary(HttpServletRequest request){
		request.setAttribute("salaries", salaryService.findAll());
		request.setAttribute("mode", "MODE_SALARIES");
		return "salary";
	}
	
	@GetMapping("/new-salary")
	public String newSalary(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "salary";
	}
	
	@PostMapping("/save-salary")
	public String newSalary(@ModelAttribute Salary salary,BindingResult bindingResult,HttpServletRequest request){
		salaryService.save(salary);
		request.setAttribute("salaries", salaryService.findAll());
		request.setAttribute("mode", "MODE_SALARIES");
		return "salary";
	}
	
	@GetMapping("/update-salaries")
	public String updateSalary(@RequestParam int emNo,HttpServletRequest request){
		request.setAttribute("salary", salaryService.findSalary(emNo));
		request.setAttribute("mode", "MODE_UPDATE");
		return "salary";
	}
	
	@GetMapping("/delete-salaries")
	public String deleteSalary(@RequestParam int emNo,HttpServletRequest request){
		salaryService.delete(emNo);
		request.setAttribute("salaries", salaryService.findAll());
		request.setAttribute("mode", "MODE_SALARIES");
		return "salary";
	}
	

}
