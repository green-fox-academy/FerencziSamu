package com.greeenfox.groot.controller;

import com.greeenfox.groot.model.ErrorMessage;
import com.greeenfox.groot.model.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object grootIndexPage(@RequestParam(value = "message", required = false) String message) {
    if (message == null) {
      return new ErrorMessage("I am Groot!");
    } else {
      return new Groot(message);
    }
  }

//  @GetMapping(value = "/groot")
//  public ResponseEntity<GrootResponse> translater(@RequestParam(value = "message", required = false) String somemessage){
//    if (somemessage == null) {
//      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
//    } else {
//      return ResponseEntity.status(HttpStatus.OK).body(new Groot(somemessage));
//    }
//  }

}
