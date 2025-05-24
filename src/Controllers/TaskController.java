package Controllers;

import models.Task;
import repository.TaskRepository;

import java.util.List;

public class TaskController {

    private TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    public void createTask(Task task) {
        repository.addTask(task);
    }

    public List<Task> getAllTasks() {
        return repository.listTasks();
    }

    public void markAsDone(String title) {
        //falta implementar
    }
}
