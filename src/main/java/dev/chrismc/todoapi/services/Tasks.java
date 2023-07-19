package dev.chrismc.todoapi.services;

import dev.chrismc.todoapi.repository.TaskData;
import dev.chrismc.todoapi.models.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tasks {
    @Autowired
    private TaskData taskRepository;
    public List<Task> allTasks() {
        return taskRepository.findAll();
    }
}
