package com.globalss.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @GetMapping(value="/hello")
  public String welcome(){
    return "Hello World !!";
  }
}
