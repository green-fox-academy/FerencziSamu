package com.greenfox.jason_fun.Services;

import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {


  @Override
  public int doubling(Integer received) {
    return received * 2;
  }

}
