package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping(value = "/useful/email")
  public String usefulEmailPage(@RequestParam("email")String emailAddress, Model model) {
    model.addAttribute("email",utilityService.validateEmail(emailAddress));
    model.addAttribute("emailAddres",emailAddress);
    return "email";
  }

}
