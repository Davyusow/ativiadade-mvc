package repository;

import DAO.TaskDAO;
import models.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public void markAsDone(Long id) {
        if(id == null) throw new RuntimeException("Required argument is null");

        getTaskById(id).ifPresent(task -> task.setStatus("done"));
    }

    public Optional<Task> getTaskById(Long id) {
        if(id == null) throw new RuntimeException("Required argument is null");

        for (Task task : dados) {
            if (task.getId().equals(id)) return Optional.of(task);
        }
        return Optional.empty();
    }

    @Override
    public List<Task> getDoneTasks() {
        List<Task> tasks = listTasks();
        List<Task> doneTasks = new ArrayList<>();

        for(Task task : tasks) {
            if(task.getStatus().equals("done")) {
                doneTasks.add(task);
            }
        }

        return doneTasks;
    }

    @Override
    public List<Task> getUndoneTasks() {
        List<Task> tasks = listTasks();
        List<Task> undoneTasks = new ArrayList<>();

        for(Task task : tasks) {
            if(!task.getStatus().equals("done")) {
                undoneTasks.add(task);
            }
        }

        return undoneTasks;
    }


}
