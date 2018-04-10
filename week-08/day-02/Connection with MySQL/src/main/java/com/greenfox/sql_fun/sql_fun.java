package com.greenfox.sql_fun;

import com.greenfox.sql_fun.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class sql_fun implements CommandLineRunner {
  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(sql_fun.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }

}