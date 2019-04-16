package ru.job.collections;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        if (tasks.isEmpty()) {
            tasks.add(task);
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getPriority() > task.getPriority()) {
                    tasks.add(i, task);
                    break;
                }
            }
        }

    }

    public Task take() {
        return this.tasks.poll();
    }
}