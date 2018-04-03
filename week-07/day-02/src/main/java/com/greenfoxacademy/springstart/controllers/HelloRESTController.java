package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {
  AtomicLong id = new AtomicLong(0);

  @RequestMapping(value = "greeting")
  public Greeting Greeting(@RequestParam("name") String name) {
    return new Greeting(id.addAndGet(1), "Hello," + name + "!");
  }
}
