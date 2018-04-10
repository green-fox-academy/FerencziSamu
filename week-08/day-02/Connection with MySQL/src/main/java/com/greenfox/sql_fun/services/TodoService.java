package com.greenfox.sql_fun.services;

import com.greenfox.sql_fun.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TodoService {
  List<Todo> findActives();
  void saveTodo(Todo todo);
}
