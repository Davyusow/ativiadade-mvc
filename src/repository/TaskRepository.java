package repository;

import DAO.TaskDAO;
import models.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository implements TaskDAO {

    private List<Task> dados = new ArrayList<Task>();

    @Override
    public void addTask(Task task) {

    }

    @Override
    public List<Task> listTasks() {
        return List.of();
    }

    @Override
    public void markAsDone(Task task) {

    }
}
