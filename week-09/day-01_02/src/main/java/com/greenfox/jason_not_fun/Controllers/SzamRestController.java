package com.greenfox.jason_not_fun.Controllers;

import com.greenfox.jason_not_fun.Models.Greet;
import com.greenfox.jason_not_fun.Models.Hiba;
import com.greenfox.jason_not_fun.Models.Szam;
import com.greenfox.jason_not_fun.Models.ToAppend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam
      (value = "title", required = false) String title) {
    if (name == null) {
      return new Hiba("Please provide a name!");
    } else if (title == null) {
      return new Hiba("Please provide a title!");
    } else {
      return new Greet(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable(name = "appendable") String name) {
    return new ToAppend(name);
  }

}