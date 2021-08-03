package de.propra.multiconstructor;

import org.springframework.stereotype.Component;

@Component
public class MainConstructor {

  private final DependencyWithMultipleConstructors mult;

  public MainConstructor( DependencyWithMultipleConstructors mult) {
    this.mult = mult;
  }

  public void ping(int n) {
    System.out.print("Ping from "+getClass().getSimpleName());
    mult.ping();
  }

}
