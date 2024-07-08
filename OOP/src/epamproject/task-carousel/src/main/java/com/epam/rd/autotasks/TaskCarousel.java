package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.List;

public class TaskCarousel {
    private List<Task> tasks;
    private int capacity;
    private int currentTaskIndex;

    public TaskCarousel(int capacity) {
        this.capacity = capacity;
        this.tasks = new ArrayList<>(capacity);
        this.currentTaskIndex = 0;
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public boolean isFull() {
        return tasks.size() == capacity;
    }

    public boolean addTask(Task task) {
        if (task == null || task.isFinished() || isFull()) {
            return false;
        }
        tasks.add(task);
        return true;
    }

    public boolean execute() {
        if (isEmpty()) {
            return false;
        }

        Task currentTask = tasks.get(currentTaskIndex);
        currentTask.execute();
        if (currentTask.isFinished()) {
            tasks.remove(currentTaskIndex);
            if (tasks.isEmpty()) {
                currentTaskIndex = 0;
            } else {
                currentTaskIndex %= tasks.size();
            }
        } else {
            currentTaskIndex = (currentTaskIndex + 1) % tasks.size();
        }

        return true;
    }

}
