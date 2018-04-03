package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
  AtomicLong counter = new AtomicLong(0);

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", " World");
    model.addAttribute("counter", counter.addAndGet(1));
    return "greeting";
  }
}
