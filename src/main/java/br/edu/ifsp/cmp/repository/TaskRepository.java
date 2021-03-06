package br.edu.ifsp.cmp.repository;

import java.util.List;

import br.edu.ifsp.cmp.entities.Task;

public interface TaskRepository {

    public String insert(Task task);

    public void remove(Task task);

    public Task searchByName(String name);

    public List<Task> getAll();
}
