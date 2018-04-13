package com.greenfox.sql_fun.services;

import com.greenfox.sql_fun.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
  List<Todo> findActives();
  List<Todo> findDones();
  void saveTodo(Todo todo);
  void deleteTodo(Long id);
  void updateIsDone(Long id);
  void updateIsUrgent(Long id);
}
