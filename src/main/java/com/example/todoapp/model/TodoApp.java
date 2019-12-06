package com.example.todoapp.model;

import java.sql.Time;

public class TodoApp {

        private int id;
        private String title;
        private String description;
        private StatusEnum status;
        private Time createdAt;
        private Time updatedAt;
        private Time completedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
    }

    public Time getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Time updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Time getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Time completedAt) {
        this.completedAt = completedAt;
    }
}
