package com.greenfox.sql_fun.services;

import com.greenfox.sql_fun.models.Todo;
import com.greenfox.sql_fun.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TodoServicesImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> findActives() {
    Iterable<Todo> allTodos = todoRepository.findAll();

    return StreamSupport.stream(allTodos.spliterator(), false)
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList());
  }

  @Override
  public List<Todo> findDones() {

    Iterable<Todo> allTodos = todoRepository.findAll();

    return StreamSupport.stream(allTodos.spliterator(), false)
        .filter(todo -> todo.isDone())
        .collect(Collectors.toList());
  }

  @Override
  public void saveTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteTodo(Long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public void updateIsDone(Long id) {
    todoRepository.findById(id).get().setDone(true);
  }

}
