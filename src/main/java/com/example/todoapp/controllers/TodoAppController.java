package com.example.todoapp.controllers;

import com.example.todoapp.model.TodoApp;
import com.example.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="tasks")
public class TodoAppController {

    @Autowired
    TodoRepository todoRepo;

    @GetMapping()
    public List<TodoApp> getTask(){

        List<TodoApp> todoList = todoRepo.findAll();
        return todoList;
    }

    @PostMapping
    public TodoApp createTodo(@RequestBody TodoApp todo){
        TodoApp newTodo = todoRepo.save(todo);
        return newTodo;
    }

}
