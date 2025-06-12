package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/taskmanager") 
public class TaskManager {

    List<String> tasks = new ArrayList<>();

    @GetMapping("/list")
    public List<String> getTasks(@RequestParam("count") int count) {
        return tasks.subList(0, Math.min(count, tasks.size()));
    }

    @GetMapping("/{taskId}")
    public String getTaskById(@PathVariable("taskId") int id) {
        if (id >= 0 && id < tasks.size()) {
            return tasks.get(id);
        }
        return "Task not found";
    }

    @PostMapping
    public String addTask(@RequestParam String name) {
        tasks.add(name);
        return "Task added: " + name;
    }

    @PutMapping
    public String replaceAllTasks(@RequestParam String name) {
        tasks.clear();
        tasks.add(name);
        return "All tasks replaced with: " + name;
    }

    @PutMapping("/{taskId}")
    public String updateTask(@PathVariable("taskId") int id, @RequestParam String name) {
        if (id >= 0 && id < tasks.size()) {
            tasks.set(id, name);
            return "Task updated to: " + name;
        }
        return "Task not found";
    }

    @DeleteMapping
    public String deleteTask(@RequestParam int id) {
        if (id >= 0 && id < tasks.size()) {
            tasks.remove(id);
            return "Task deleted with id: " + id;
        }
        return "Task not found";
    }
}
