package com.example.todoapp.model;

import jdk.jfr.Unsigned;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;

public class TodoApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String title;
        private String description;
        private StatusEnum status;

        @CreationTimestamp
        @Column(name = "created_at")
        private Time createdAt;

        @UpdateTimestamp
        @Column(name = "updated_at")
        private Time updatedAt;

        @Column(name = "completed_at")
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
