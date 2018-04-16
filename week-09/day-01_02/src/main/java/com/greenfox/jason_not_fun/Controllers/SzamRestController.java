package com.greenfox.jason_not_fun.Controllers;

import com.greenfox.jason_not_fun.Models.Hiba;
import com.greenfox.jason_not_fun.Models.Szam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SzamRestController {

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Szam(input);
    } else {
      return new Hiba("Please provide an input!");
    }
  }

}