package com.greenfoxacademy.demo.Controllers;


import com.greenfoxacademy.demo.Models.Minion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String indexPageLoad() {
    return "index";
  }

  @GetMapping(value = "/login")
  public String indexLogin() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String logsYouIn(@ModelAttribute(value = "name") String name) {
    return "redirect:/main?name=" + name;
  }

  @GetMapping(value = "/main")
  public String loadsTheMainPageForYou(@RequestParam("name") String name, Model model) {
    Minion minion = new Minion(name);
    model.addAttribute("name", minion.getName());
    return "main";
  }
}
