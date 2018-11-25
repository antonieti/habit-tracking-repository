package br.edu.ifsp.cmp.repository;

import java.util.List;

import br.edu.ifsp.cmp.entities.Habit;

public interface HabitRepository {

    public String insert(Habit habit);

    public String update(Habit habit);

    public void remove(Habit habit);

    public Habit search(Habit habit);

    public List<Habit> getAll(Habit habit);
}