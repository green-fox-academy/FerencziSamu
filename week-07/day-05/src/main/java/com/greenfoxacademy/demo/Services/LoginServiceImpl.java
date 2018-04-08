package com.greenfoxacademy.demo.Services;

import com.greenfoxacademy.demo.Models.Minion;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginServiceImpl implements LoginService {

  @Override
  public boolean nameChecker(String name, List<Minion> listOfMinions) {
    for (Minion minion : listOfMinions) {
      if (minion.getName().equals(name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int findIndex(String name, List<Minion> listOfMinions) {
    for (int i = 0; i < listOfMinions.size(); i++) {
      if (listOfMinions.get(i).getName().equals(name)){
        return i;
      }
    }
    System.out.println("Something went wrong!");
    System.exit(-1);
    return -1;
  }
}
