package de.propra.multiplecomponents;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("B")
public class InterfaceImplementationB implements SomeInterface {
  @Override
  public void ping() {
    System.out.println("Ping from " + getClass().getSimpleName());
  }
}
