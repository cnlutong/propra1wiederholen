package de.propra.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MainCircularDependency {

  private TheOtherPart b;

  @Autowired
  public void setB(TheOtherPart b) {
    this.b = b;
  }

  public void ping(int n) {
    System.out.println("Ping from " + getClass().getSimpleName());
    System.out.println("I am "+this);
    b.ping();
  }
}
