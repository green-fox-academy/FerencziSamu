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

  // we got only ID related to an assigne which we want to change
  // we need to load the Assigne entity from DB based on this ID
  // and then put it into an editAssigne view (add to model)
  // return the editor view
  @GetMapping(value = "/{id}/updateName")
  public String editAssigneName(@PathVariable Long id, Model model) {
    model.addAttribute("assignee", assigneeRepository.findById(id).get());
    return "editAssignee";
  }

  //we need an endpoint for a POST action, and an Assignee as a parameter
  //in this we save the new entity into db
  //and because it has all fields (id too) it will update an existing assignee
  //then redirect to the main assigne page
  @PostMapping(value = "{id}/updateName")
  public String updateName(Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignees/";
  }

}
