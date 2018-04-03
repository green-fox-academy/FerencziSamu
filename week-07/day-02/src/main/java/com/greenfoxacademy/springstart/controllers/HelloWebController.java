package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
  String[] hellos = {"Jó napot", "Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den",
      "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  AtomicLong counter = new AtomicLong(0);

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.addAndGet(1));
    return "greeting";
  }

  @RequestMapping(value = "/web/hello")
  public String greetings(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("greetings", hellos);
    return "hello";
  }
}


