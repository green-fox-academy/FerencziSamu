package com.greenfox.sql_fun.repositories;

import com.greenfox.sql_fun.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
