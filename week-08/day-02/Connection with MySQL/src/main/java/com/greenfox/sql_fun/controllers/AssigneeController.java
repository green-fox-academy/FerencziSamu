package com.greenfox.sql_fun.controllers;

import com.greenfox.sql_fun.repositories.AssigneeRepository;
import com.greenfox.sql_fun.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo/assignees")
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRepository;

  @Autowired
  AssigneeService assigneeService;

  @RequestMapping(value = {"/", "/list"})
  public String listOfAssignees(Model model) {
    model.addAttribute("assignees",assigneeRepository.findAll());
    return "assigneesList";
  }

}
