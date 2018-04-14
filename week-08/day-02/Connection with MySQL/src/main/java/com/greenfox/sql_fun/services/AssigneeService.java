package com.greenfox.sql_fun.services;

import org.springframework.stereotype.Service;

@Service
public interface AssigneeService {
  void deleteAssignee(Long id);
}
