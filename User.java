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
import java.util.List;

public abstract class User {
    protected String userId;
    protected String username;
    protected String email;
    protected String password;
    protected List<Task> tasks;
    protected List<Project> assignedProjects;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.userId = "USER-" + Math.random();
        this.tasks = new ArrayList<>();
        this.assignedProjects = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String newUsername) {
        if (newUsername == null || newUsername.isEmpty()) throw new IllegalArgumentException("Username cannot be empty.");
        this.username = newUsername;
    }

    public void setEmail(String newEmail) {
        if (newEmail == null || !newEmail.contains("@")) throw new IllegalArgumentException("Invalid email address.");
        this.email = newEmail;
    }

    public abstract boolean register(String username, String email, String password);

    public abstract boolean login(String email, String password);

    public abstract void logout();
}
