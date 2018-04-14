package com.greenfox.sql_fun.controllers;

import com.greenfox.sql_fun.models.Assignee;
import com.greenfox.sql_fun.repositories.AssigneeRepository;
import com.greenfox.sql_fun.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo/assignees")
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRepository;

  @Autowired
  AssigneeService assigneeService;

  @RequestMapping(value = {"/", "/list"})
  public String listOfAssignees(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assigneesList";
  }

  @GetMapping(value = "/{id}/updateName")
  public String editAssigneName(@PathVariable Long id, Model model) {
    model.addAttribute("assignee", assigneeRepository.findById(id).get());
    return "editAssignee";
  }

  @PostMapping(value = "{id}/updateName")
  public String updateName(Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignees/";
  }

  @RequestMapping(value = "{id}/delete")
  public String deleteAssignee(@PathVariable(value = "id") Long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/todo/assignees/";
  }

}
