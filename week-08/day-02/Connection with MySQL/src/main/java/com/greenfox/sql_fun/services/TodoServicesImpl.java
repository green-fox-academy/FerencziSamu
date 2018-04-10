package com.greenfox.sql_fun.services;

import com.greenfox.sql_fun.models.Todo;
import com.greenfox.sql_fun.repositories.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServicesImpl implements TodoService {

  @Autowired
  TodoInterface todoInterface;

  @Override
  public List<Todo> findActives() {
    List<Todo> todos = new ArrayList<>();
    todoInterface.findAll().forEach(todos::add);
    for (int i = 0; i < todos.size(); i++) {
      if (todos.get(i).isDone()) {
        todos.remove(i);
      }
    }
    return todos;
  }

}
