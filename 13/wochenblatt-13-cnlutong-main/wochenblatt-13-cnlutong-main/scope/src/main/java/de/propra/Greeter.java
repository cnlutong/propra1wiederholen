package de.propra;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Greeter {
  private String prefix = "Hallo";

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public void print(String message) {
    System.out.println(prefix + " "+message);
  }


}
