package DAO;

import models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskDAO {

    public void addTask(Task task);

    public List<Task> listTasks();

    public void markAsDone(Long id);

    public Optional<Task> getTaskById(Long id);

    public List<Task> getDoneTasks();

    public List<Task> getUndoneTasks();
}
