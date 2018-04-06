package com.greenfoxacademy.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String indexPageLoad() {
    return "index";
  }

  @RequestMapping(value = "/login")
  public String indexLogin() {
    return "login";
  }

}
