package com.greenfox.sql_fun.controllers;

import com.greenfox.sql_fun.models.Todo;
import com.greenfox.sql_fun.repositories.TodoRepository;
import com.greenfox.sql_fun.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @Autowired
  TodoService todoService;

  @RequestMapping(value = {"/", "/list"})
  public String todoList(Model model, @RequestParam(value = "isActive", required = false) Boolean
      isActive) {
    if (isActive == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else if ((isActive)) {
      model.addAttribute("todos", todoService.findActives());
    } else {
      model.addAttribute("todos", todoService.findDones());
    }
    return "todosList";
  }

  @PostMapping(value = "/add")
  public String addingNewTodo(@ModelAttribute("todo") Todo todo) {
    todoService.saveTodo(todo);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/add")
  public String showingNewTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @RequestMapping(value = "/{id}/delete")
  public String delete(@PathVariable Long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/progress")
  public String update(@PathVariable Long id) {
    todoService.updateIsDone(id);
    todoRepository.save(todoRepository.findById(id).get());
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/urgent")
  public String makeUrgent(@PathVariable Long id) {
    todoService.updateIsUrgent(id);
    todoRepository.save(todoRepository.findById(id).get());
    return "redirect:/todo/";
  }

  @PostMapping(value = "/search")
  public String search(@ModelAttribute(name = "title")String title,Model model) {
    model.addAttribute("todos",todoRepository.findTitle(title));
    return "todosList";
  }

}