package com.greenfoxacademy.demo.Controllers;


import com.greenfoxacademy.demo.Models.Minion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Controller
public class MainController {
  List<Minion> listOfMinions = new ArrayList<>(Arrays.asList());

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
  public String loadsTheMainPageForYou(@RequestParam(value = "name", required = true) String name, Model model) {
    AtomicLong id = new AtomicLong(0);
    if (nameChecker(name)) {
      model.addAttribute("name", listOfMinions.get(id.intValue()).getName());
      return "main";
    } else {
      Minion minion = new Minion(name, id.addAndGet(1));
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