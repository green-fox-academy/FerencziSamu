package com.greenfox.h2;

import com.greenfox.h2.models.Todo;
import com.greenfox.h2.repositories.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2Application implements CommandLineRunner {
	@Autowired
	TodoInterface todoInterface;

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoInterface.save(new Todo("Start the day"));
		todoInterface.save(new Todo("Finish H2 workshop 1"));
		todoInterface.save(new Todo("Finish JPA workshop 2"));
		todoInterface.save(new Todo("Create a CRUD project"));
	}

}
