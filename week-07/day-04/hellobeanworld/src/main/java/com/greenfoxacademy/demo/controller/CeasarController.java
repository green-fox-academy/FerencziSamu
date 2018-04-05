package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CeasarController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping(value = "/useful/ceasar")
  public String usefulCeasarPage(@RequestParam("word") String word, @RequestParam("number") int
      number, Model model) {
    model.addAttribute("ceasar", utilityService.caesar(word,number));
    return "ceasar";
  }

}
