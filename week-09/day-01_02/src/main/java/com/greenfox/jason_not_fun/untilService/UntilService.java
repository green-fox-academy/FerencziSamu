package com.greenfox.jason_not_fun.untilService;

import com.greenfox.jason_not_fun.Models.Until;
import org.springframework.stereotype.Service;

@Service
public interface UntilService {
   Object factorial(Until until);
   Object summerize(Until until);
}
