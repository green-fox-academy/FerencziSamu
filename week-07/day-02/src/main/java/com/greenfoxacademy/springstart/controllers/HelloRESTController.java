package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  @RequestMapping(value = "greeting")
  public Greeting Greeting(@RequestParam("name")String name) {
    return new Greeting(1, "Hello," + name + "!");
  }
}