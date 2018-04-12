package com.greenfox.sql_fun.repositories;

import com.greenfox.sql_fun.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

}