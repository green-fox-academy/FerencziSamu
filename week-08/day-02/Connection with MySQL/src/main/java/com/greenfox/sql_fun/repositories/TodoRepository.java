package com.greenfox.sql_fun.repositories;

import com.greenfox.sql_fun.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

  @Query("select lower(c) from Todo c where c.title like %:title%")
  List<Todo> findTitle(@Param("title") String title);

}