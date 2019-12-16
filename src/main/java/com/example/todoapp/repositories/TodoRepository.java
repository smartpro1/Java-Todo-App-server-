package com.example.todoapp.repositories;

import com.example.todoapp.model.TodoApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoApp, Integer> {
}

