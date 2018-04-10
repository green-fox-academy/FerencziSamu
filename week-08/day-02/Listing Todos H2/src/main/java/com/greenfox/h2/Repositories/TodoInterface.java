package com.greenfox.h2.Repositories;

import com.greenfox.h2.Models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoInterface extends CrudRepository<Todo, Long> {
}
