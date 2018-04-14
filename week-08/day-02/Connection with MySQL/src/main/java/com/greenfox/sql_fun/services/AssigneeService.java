package com.greenfox.sql_fun.services;

import com.greenfox.sql_fun.models.Assignee;
import org.springframework.stereotype.Service;

@Service
public interface AssigneeService {
  void deleteAssignee(Long id);
  void saveAssignee(Assignee assignee);

}
