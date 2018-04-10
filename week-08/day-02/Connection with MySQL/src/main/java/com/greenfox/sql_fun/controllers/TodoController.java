package com.greenfox.sql_fun.controllers;

import com.greenfox.sql_fun.repositories.TodoInterface;
import com.greenfox.sql_fun.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoInterface todoInterface;

  @Autowired
  TodoService todoService;

  @RequestMapping(value = {"/", "/list"})
  public String todoList(Model model, @RequestParam(value = "isActive", required = false) boolean
      isActive) {
    if (isActive) {
      model.addAttribute("todos", todoService.findActives());
    } else {
      model.addAttribute("todos", todoInterface.findAll());
    }
    return "todosList";
  }

  @RequestMapping(value = "/add")
  public String addingNewTodo(Model model, @ModelAttribute(value = "title")String title) {
    model.addAttribute("title",title);
    return "add";
  }
}