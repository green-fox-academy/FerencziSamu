package com.greenfox.h2.repositories;

import com.greenfox.h2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoInterface extends CrudRepository<Todo, Long> {
}
