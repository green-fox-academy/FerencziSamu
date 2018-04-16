package com.greenfox.jason_fun.Controllers;

import com.greenfox.jason_fun.Services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  NumberService numberService;

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value = "received")Integer input) {
    return numberService.doubling(input);
  }

}
