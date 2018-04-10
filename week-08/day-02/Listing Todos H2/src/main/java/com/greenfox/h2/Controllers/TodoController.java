package com.greenfox.h2.Controllers;

import com.greenfox.h2.Repositories.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoInterface todoInterface;

  @RequestMapping(value = {"/","/list"})
  @ResponseBody
  public String todoList(Model model) {
    return "This is my first todo";
  }

}
