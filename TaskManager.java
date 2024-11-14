package com.mycompany.task_player;
import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;

public class TaskManager {
    private PriorityQueue<Task> tasks;
    private ArrayList<Task> taskHistory;

    public TaskManager() {
        this.tasks = new PriorityQueue<>((a, b) -> b.getPriority() - a.getPriority());
        this.taskHistory = new ArrayList<>();
    }

    public Task createTask(String title, int priority, Date dueDate) {
        String taskId = generateTaskId();
        Task task = new Task(taskId, title, priority, dueDate, priority * 10, priority, "Pending");
        tasks.add(task);
        return task;
    }

    public void editTask(String taskId, String newTitle, int newPriority, Date newDueDate) {
        Task task = findTaskById(taskId);
        if (task != null) {
            task.setTitle(newTitle);
            task.setPriority(newPriority);
            task.setDueDate(newDueDate);
        }
    }

    public void deleteTask(String taskId) {
        tasks.removeIf(task -> task.getTaskId().equals(taskId));
    }

    public void assignTask(User user) {
        Task task = tasks.poll();
        if (task != null) {
            user.tasks.add(task);
        }
    }

    public void markComplete(String taskId) {
        Task task = findTaskById(taskId);
        if (task != null) {
            task.markAsCompleted();
            taskHistory.add(task);
            tasks.remove(task);
        }
    }

    private Task findTaskById(String taskId) {
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                return task;
            }
        }
        return null;
    }

    private String generateTaskId() {
        return "TASK-" + (taskHistory.size() + tasks.size() + 1);
    }
}
