/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_player;

/**
 *
 * @author mdwivaaryaerlangga
 */
import java.util.Date;

public class Task {
    private String taskId;
    private String title;
    private int priority;
    private Date dueDate;
    private int points;
    private int difficulty;
    private String status;

    public Task(String taskId, String title, int priority, Date dueDate, int points, int difficulty, String status) {
        this.taskId = taskId;
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.points = points;
        this.difficulty = difficulty;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int newPriority) {
        this.priority = newPriority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date newDueDate) {
        this.dueDate = newDueDate;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return "Completed".equals(status);
    }

    public void markAsCompleted() {
        this.status = "Completed";
    }

    public String getTaskDetails() {
        return "Task ID: " + taskId + ", Title: " + title + ", Priority: " + priority + ", Points: " + points + ", Status: " + status;
    }
}
