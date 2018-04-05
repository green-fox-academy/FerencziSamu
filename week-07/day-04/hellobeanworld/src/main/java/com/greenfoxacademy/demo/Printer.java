package com.greenfoxacademy.demo;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
  public String log(String message) {
    return "Localtime: " + LocalDateTime.now() + " MY PRINTER SAYS --- " + message;
  }
}
