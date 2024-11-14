/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_player;

/**
 *
 * @author mdwivaaryaerlangga
 */
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Owner extends User {
    private String ownerId;
    private Map<String, User> users;
    private TaskManager taskManager;

    public Owner(String username, String email, String password) {
        super(username, email, password);
        this.ownerId = "OWNER-" + UUID.randomUUID();
        this.users = new HashMap<>();
        this.taskManager = new TaskManager();
    }

    @Override
    public boolean register(String username, String email, String password) {
        if (users.containsKey(email)) {
            System.out.println("Registration failed: email already registered.");
            return false;
        }
        Player newUser = new Player(username, email, password);
        users.put(newUser.getUserId(), newUser);
        System.out.println("User " + username + " registered successfully.");
        return true;
    }

    @Override
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Owner " + username + " logged out.");
    }

    public void manageUsers() {
        users.forEach((id, user) -> System.out.println("UserID: " + id + ", Username: " + user.getUsername()));
    }

    public void deleteUser(String userId) {
        if (users.remove(userId) != null) {
            System.out.println("User with ID " + userId + " has been deleted.");
        } else {
            System.out.println("User ID not found.");
        }
    }

    public void editUser(String userId, String newUsername, String newEmail) {
        User user = users.get(userId);
        if (user != null) {
            user.setUsername(newUsername);
            user.setEmail(newEmail);
            System.out.println("User " + userId + " updated successfully.");
        } else {
            System.out.println("User ID not found.");
        }
    }

    public void viewReports() {
        users.forEach((id, user) -> {
            System.out.println("User: " + user.getUsername());
            user.getTasks().forEach(task -> System.out.println(" - Task: " + task.getTaskDetails()));
        });
    }
}
