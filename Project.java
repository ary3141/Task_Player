package com.mycompany.task_player;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String projectId;
    private String title;
    private ArrayList<User> assignedUsers = new ArrayList<>();
    private String status;
    private Date dueDate;

    public Project(String title, String projectId) {
        this.title = title;
        this.projectId = projectId;
        this.status = "Not Started";
    }

    public String getProjectStatus() {
        return status;
    }

    public void updateProjectStatus(String newStatus) {
        this.status = newStatus;
    }

    public ArrayList<Task> getTasks() {
        ArrayList<Task> allTasks = new ArrayList<>();
        for (User user : assignedUsers) {
            allTasks.addAll(user.getTasks());
        }
        return allTasks;
    }

    public ArrayList<User> getAssignedUsers() {
        return assignedUsers;
    }
}
