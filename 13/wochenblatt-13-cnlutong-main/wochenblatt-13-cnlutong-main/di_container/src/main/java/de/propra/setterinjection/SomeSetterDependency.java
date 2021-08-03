package de.propra.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class SomeSetterDependency {


  public void ping() {
    System.out.println("Ping from "+getClass().getSimpleName());
  }

}
