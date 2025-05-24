package DAO;

import models.Task;

import java.util.List;

public interface TaskDAO {

    public void addTask(Task task);

    public List<Task> listTasks();

    public void markAsDone(Task task);
}
