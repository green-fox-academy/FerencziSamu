package com.greenfoxacademy.demo.Controllers;


import com.greenfoxacademy.demo.Models.Minion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
  List<Minion> listOfMinions = new ArrayList<>();

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
    if (nameChecker(name)) {
      model.addAttribute("name", name);
      return "main";
    } else {
      Minion minion = new Minion(name);
      listOfMinions.add(minion);
      return "redirect:/login";
    }
  }

  public boolean nameChecker(String name) {
    boolean memberOfList = false;
    for (int i = 0; i < listOfMinions.size(); i++) {
      if (name.equals(listOfMinions.get(i).getName())) {
        memberOfList = true;
      }
    }
    return memberOfList;

  }
}