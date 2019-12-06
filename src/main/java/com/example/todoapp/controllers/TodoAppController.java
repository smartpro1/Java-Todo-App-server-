package com.example.todoapp.controllers;

import com.example.todoapp.model.TodoApp;
import com.example.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="tasks")
public class TodoAppController {

    @Autowired
    TodoRepository todoRepo;


    @GetMapping
    public List<TodoApp> getAllTasks(){

        List<TodoApp> todoList = todoRepo.findAll();
        return todoList;
    }

    @GetMapping(value="/{id}")
    public Optional<TodoApp> getTaskById(@PathVariable("id") int id){
       Optional<TodoApp> oneTodo = todoRepo.findById(id);
       return oneTodo;
    }

    @PostMapping
    public TodoApp createTodo(@RequestBody TodoApp todo){
        TodoApp newTodo = todoRepo.save(todo);
        return newTodo;
    }

    @PutMapping(consumes={"application/json"})
    public TodoApp updateTodo(@RequestBody TodoApp updateTask){
        TodoApp updateTodo = todoRepo.save(updateTask);
        return updateTodo;
    }

    @DeleteMapping(value="/{id}")
    public String deleteTodobyId(@PathVariable("id") int id){
        //Optional<TodoApp> deleteTodo = todoRepo.findById(id);
        todoRepo.deleteById(id);
        return "Item successfully deleted";
    }




}
