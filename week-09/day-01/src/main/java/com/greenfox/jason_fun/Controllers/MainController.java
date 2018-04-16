package com.greenfox.jason_fun.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping(value = "/")
  public String loadIndexPage() {
    return "index";
  }
}
