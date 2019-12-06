package com.example.todoapp.controllers;

import com.example.todoapp.model.TodoApp;
import com.example.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="tasks")
public class TodoAppController {

    @Autowired
    TodoRepository todoRepo;


    @GetMapping
    public ResponseController<List<TodoApp>> getAllTasks(){

        List<TodoApp> todoList = todoRepo.findAll();
        return new ResponseController<>(HttpStatus.OK, "all tasks successfully retrieved", todoList);
    }

    @GetMapping(value="/{id}")
    public ResponseController<Optional<TodoApp>> getTaskById(@PathVariable("id") int id){
       Optional<TodoApp> oneTodo = todoRepo.findById(id);
        return new ResponseController<>(HttpStatus.OK, "task successfully retrieved", oneTodo);
    }

    @PostMapping
    public TodoApp createTodo(@RequestBody TodoApp todo){
        TodoApp newTodo = todoRepo.save(todo);
        return newTodo;
    }

    @PutMapping(consumes={"application/json"})
    public ResponseController<TodoApp> updateTodo(@RequestBody TodoApp updateTask){
        TodoApp updateTodo = todoRepo.save(updateTask);
        return new ResponseController<>(HttpStatus.OK, "update successful", updateTodo);
    }

    @DeleteMapping(value="/{id}")
    public ResponseController<Optional<TodoApp>> deleteTodoById(@PathVariable("id") int id){
        Optional<TodoApp> deleteTodo = todoRepo.findById(id);
        todoRepo.deleteById(id);
        return new ResponseController<>(HttpStatus.OK, "delete successful", deleteTodo);
    }




}
