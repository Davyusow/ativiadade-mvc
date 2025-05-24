package repository;

import DAO.TaskDAO;
import models.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository implements TaskDAO {

    private List<Task> dados = new ArrayList<Task>();

    @Override
    public void addTask(Task task) {
        if(task == null) throw new RuntimeException("Required argument is null");

        dados.add(task);
    }

    @Override
    public List<Task> listTasks() {
        return dados;
    }

    @Override
    public void markAsDone(Task task) {
        if(task == null) throw new RuntimeException("Required argument is null");

        task.setStatus("done");
    }
}
