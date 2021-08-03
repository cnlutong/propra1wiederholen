package de.propra.multiplecomponents;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainMultipleComponents {

  private final SomeInterface dep;

  public MainMultipleComponents(@Qualifier("A") SomeInterface dep) {
    this.dep = dep;
  }

  public void ping(int n) {
    System.out.println("Ping from " + getClass().getSimpleName());
    dep.ping();
  }

}
