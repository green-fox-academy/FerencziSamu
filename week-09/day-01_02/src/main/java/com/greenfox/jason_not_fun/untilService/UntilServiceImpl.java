package com.greenfox.jason_not_fun.untilService;

import com.greenfox.jason_not_fun.Models.Hiba;
import com.greenfox.jason_not_fun.Models.Until;
import com.greenfox.jason_not_fun.Models.UntilResponse;
import org.springframework.stereotype.Service;

@Service
public class UntilServiceImpl implements UntilService {

  @Override
  public Object factorial(Until until) {
    int result = 1;
    if (until != null) {
      for (int i = 1; i <= until.getUntil(); i++) {
        result *= i;
      }
      return new UntilResponse(result);
    } else {
      return new Hiba("Please provide a number!");
    }
  }

  @Override
  public Object summerize(Until until) {
    int result = 0;
    if (until != null) {
      for (int i = 1; i <= until.getUntil(); i++) {
        result += i;
      }
      return new UntilResponse(result);
    } else {
      return new Hiba("Please provide a number!");
    }
  }

}
