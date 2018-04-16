package com.greenfox.jason_not_fun.Controllers;

import com.greenfox.jason_not_fun.Models.*;
import com.greenfox.jason_not_fun.untilService.UntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SzamRestController {

  @Autowired
  UntilService untilService;

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

  @PostMapping("/dountil/{what}")
  public Object dountil(@PathVariable(value = "what") String what, @RequestBody (required =
      false) Until until) {
    if (what.equals("sum")) {
      return untilService.summerize(until);
    } else if(what.equals("factor")) {
      return untilService.factorial(until);
    } else {
      return new Hiba("Please provide a number!");
    }
  }

}