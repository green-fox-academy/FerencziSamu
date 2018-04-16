package com.greenfox.jason_not_fun.untilService;

import com.greenfox.jason_not_fun.Models.Until;
import org.springframework.stereotype.Service;

@Service
public class UntilServiceImpl implements UntilService {

  @Override
  public Object factorial(Until until) {
    int i, fact = 1;
    int number = until.getUntil();
    for (i = 1; i <= number; i++) {
      fact = fact * i;
    }
    return fact;
  }

  @Override
  public Object summerize(Until until) {
    return until.getUntil() * 6;
  }
}
