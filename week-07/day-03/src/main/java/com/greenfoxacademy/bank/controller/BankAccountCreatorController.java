package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.modelPackage.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountCreatorController {
  BankAccount bankAccount2 = new BankAccount("Mufasa", 2500.0, "lion", "Pengo",false,true);
  BankAccount bankAccount3 = new BankAccount("Zordon", 2500.0, "lion", "Pengo",false,false);
  BankAccount bankAccount4 = new BankAccount("Timon", 2500.0, "mongoose", "Pengo",false,false);
  BankAccount bankAccount5 = new BankAccount("Pumba", 2500.0, "boar", "Pengo",false,true);
  BankAccount bankAccount6 = new BankAccount("Nala", 2500.0, "lion", "Pengo",true,true);
  List<BankAccount> Bank = new ArrayList<>(Arrays.asList(bankAccount2, bankAccount3, bankAccount4,
      bankAccount5, bankAccount6));

  @RequestMapping(value = "/accounts")
  public String showAccountsOfBank(Model model) {
    model.addAttribute("accounts", Bank);
    return "accounts";
  }

}

