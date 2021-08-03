package de.propra.greeter_di;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

  private final String message = "Hallo";

  public String greet(String name) {
    return message + " " + name + "!";
  }

}
