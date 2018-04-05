package com.greenfoxacademy.demo;


import org.springframework.beans.factory.annotation.Autowired;

public class BlueColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    System.out.println(printer.log("This is blue color..."));
  }
}

