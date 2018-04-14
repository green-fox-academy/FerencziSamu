package com.greenfox.sql_fun.services;

import com.greenfox.sql_fun.models.Assignee;
import com.greenfox.sql_fun.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService{

  @Autowired
  AssigneeRepository assigneeRepository;


  @Override
  public void deleteAssignee(Long id) {
    assigneeRepository.deleteById(id);
  }

  @Override
  public void saveAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

}
