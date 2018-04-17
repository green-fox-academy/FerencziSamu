package com.greeenfox.groot.controller;

import com.greeenfox.groot.model.ErrorMessage;
import com.greeenfox.groot.model.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object grootIndexPage(@RequestParam(value = "message", required = false) String message) {
    if (message == null) {
      return new ErrorMessage("I am Groot!");
    } else {
      return new Groot(message);
    }
  }

}
