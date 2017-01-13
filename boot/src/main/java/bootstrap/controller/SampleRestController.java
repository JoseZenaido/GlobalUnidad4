package bootstrap.controller;

/*import java.util.Date;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import bootstrap.service.ClienteService;
import bootstrap.service.FilmService;
import bootstrap.service.SalaryService;
import bootstrap.service.TaskService;

@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService;
	@Autowired
	private FilmService filmService;
	@Autowired
	private SalaryService SalaryService;
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/hello")
	public String hello(){
		return "Helo World Zenaido";
	}
	
	@GetMapping("/all-t")
	public String allTasks(){
		return taskService.findAll().toString();
	}
	@GetMapping("/all-s")
	public String allSalaries(){
		return SalaryService.findAll().toString();
	}
	
	/*
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name, @RequestParam String desc){
		Task task = new Task(name,desc,new Date(), false);
		taskService.save(task);
		return "Task saved!";
	}
	
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id){
		taskService.delete(id);
		return "Task deleted!";
	}*/
	
	@GetMapping("/all")
	public String allFilms(){
		return filmService.findAll().toString();
	}
	/*
	@GetMapping("/save")
	public String saveTFilm(@RequestParam String name,@RequestParam String gender,  @RequestParam String desc){
		Film film = new Film(name,gender,desc,new Date(), false);
		filmService.save(film);
		return "Task film!";
	}*/
}
