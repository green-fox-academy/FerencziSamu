package com.greenfoxacademy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldBeanWebController {

  @RequestMapping(value = "/useful")
  public String usefulMainPage() {
    return "useful";
  }

  @RequestMapping(value = "/useful/colored")
  public String usefulColoredBackgroundPage() {
    return "colored";
  }
}
