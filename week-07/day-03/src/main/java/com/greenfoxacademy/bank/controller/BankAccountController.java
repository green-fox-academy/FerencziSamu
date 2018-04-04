package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.modelPackage.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  @RequestMapping(value = "/show")
  public String showAccount(Model model) {
    BankAccount bankAccount1 = new BankAccount("Simba", 2000.00, "lion", "zebra",true,true);
    model.addAttribute("name", bankAccount1.getName());
    model.addAttribute("balance", bankAccount1.getBalance());
    model.addAttribute("animalType", bankAccount1.getAnimalType());
    model.addAttribute("currency", bankAccount1.getCurrency());
    return "show";
  }

}


