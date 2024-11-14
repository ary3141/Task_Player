/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_player;

/**
 *
 * @author mdwivaaryaerlangga
 */
import java.util.ArrayList;

public class Player extends User {
    private ArrayList<Task> assignedTasks;

    public Player(String username, String email, String password) {
        super(username, email, password);
        this.assignedTasks = new ArrayList<>();
    }

    @Override
    public boolean register(String username, String email, String password) {
        System.out.println("Player registration is managed by Owner.");
        return false;
    }

    @Override
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Player " + username + " logged out.");
    }

    public void addAssignedTask(Task task) {
        assignedTasks.add(task);
    }

    public void removeAssignedTask(String taskId) {
        assignedTasks.removeIf(task -> task.getTaskId().equals(taskId));
    }

    public void viewAssignedTasks() {
        assignedTasks.forEach(task -> System.out.println("Task ID: " + task.getTaskId() + ", Title: " + task.getTitle()));
    }

    public void completeTask(String taskId) {
        for (Task task : assignedTasks) {
            if (task.getTaskId().equals(taskId)) {
                task.markAsCompleted();
                System.out.println("Task " + taskId + " completed.");
                break;
            }
        }
    }
}
