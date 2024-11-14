package com.mycompany.task_player;
import java.util.HashMap;
import java.util.Map;

public class Gamification {
    private int points;
    private int level;
    private Map<String, Integer> achievements = new HashMap<>();
    private int tasksCompleted;

    public Gamification() {
        this.points = 0;
        this.level = 1;
        this.tasksCompleted = 0;
    }

    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return level;
    }

    public Map<String, Integer> getAchievements() {
        return achievements;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void awardPoints(int points) {
        this.points += points;
        if (this.points >= 100) {
            levelUp();
        }
    }

    public void levelUp() {
        this.level++;
        this.points = 0;
    }

    public void unlockAchievement(String achievementName) {
        achievements.put(achievementName, achievements.getOrDefault(achievementName, 0) + 1);
    }

    public void completeTask() {
        this.tasksCompleted++;
    }

    public String getUserStatus() {
        return "Level: " + level + ", Points: " + points + ", Tasks Completed: " + tasksCompleted;
    }
}
