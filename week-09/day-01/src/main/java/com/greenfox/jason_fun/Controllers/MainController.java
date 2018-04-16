package com.greenfox.jason_fun.Controllers;


import com.greenfox.jason_fun.Services.SzamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  SzamService szamService;

  @GetMapping(value = "/")
  public String loadIndexPage() {
    return "index";
  }

}
