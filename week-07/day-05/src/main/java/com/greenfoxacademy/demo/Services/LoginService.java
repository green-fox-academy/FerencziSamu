package com.greenfoxacademy.demo.Services;

import com.greenfoxacademy.demo.Models.Minion;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoginService {

  boolean nameChecker(String name, List<Minion> listOfMinions);
  int findIndex(String name, List<Minion> listOfMinions);
}
