package models;

import java.util.concurrent.atomic.AtomicLong;

public class Task {

    private static final AtomicLong counter = new AtomicLong();

    private Long id;
    private String name;
    private String description;
    private String status;

    public Task(String name, String description) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.description = description;
        this.status = "Pendente";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AtomicLong getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
