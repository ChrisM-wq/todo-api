package dev.chrismc.todoapi.contollers;

import dev.chrismc.todoapi.models.Task;
import dev.chrismc.todoapi.services.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class Test {
    @Autowired
    private Tasks tasksService;
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        return new ResponseEntity<List<Task>>(tasksService.allTasks(), HttpStatus.OK);
    }
}
