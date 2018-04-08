package com.greenfoxacademy.demo.Controllers;


import com.greenfoxacademy.demo.Models.Minion;
import com.greenfoxacademy.demo.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
  private List<Minion> listOfMinions = new ArrayList<>();

  private final LoginService loginService;

  @Autowired
  MainController(LoginService loginService){
    this.loginService = loginService;
  }

  @RequestMapping(value = "/")
  public String indexPageLoad() {
    return "index";
  }

  @GetMapping(value = "/login")
  public String indexLogin() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String logsYouIn(@ModelAttribute(value = "name") String name, Model model) {
    model.addAttribute("name", name);
    return "redirect:/main?name=" + name;
  }

  @GetMapping(value = "/main")
  public String loadsTheMainPageForYou(@RequestParam(value = "name") String name, Model model) {

    if (loginService.nameChecker(name, listOfMinions)) {
      int index = loginService.findIndex(name, listOfMinions);
      model.addAttribute("name", listOfMinions.get(index).getName());
      return "main";
    } else {
      Minion minion = new Minion(name);
      listOfMinions.add(minion);
      return "redirect:/login";
    }
  }
}