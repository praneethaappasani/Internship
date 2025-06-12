package com.example.demo.Controller;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@Controller 
@RequestMapping("/task")
public class TaskController {
	@GetMapping
	public void getTasks(@RequestParam ("count") int count)
	{
		System.out.println("inside get tasks");
	}
	@GetMapping("/{taskId}")
	public void getTasksById(@PathVariable ("taskId")int tId)
	{
		System.out.println("inside get tasks with Id");
	}
	@PostMapping
	@ResponseBody
	public String postTasks() {
	    System.out.println("inside post tasks");
	    return "Task posted successfully";
	}
	@PutMapping
	public void putTasks()
	{
		System.out.println("inside put tasks");
	}
	@PutMapping("/{taskId}")
	public void putTasksById(@PathVariable ("taskId")int tId)
	{
		System.out.println("inside put tasks with Id");
	}
	@DeleteMapping
	public void delTasks()
	{
		System.out.println("inside delete tasks");
	}
	
}