package de.propra.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TheOtherPart {

  private MainCircularDependency a;

  @Autowired
  public void setA(MainCircularDependency a) {
    this.a = a;
  }

  public void ping() {
    System.out.println("Ping from " + getClass().getSimpleName());
    System.out.println("MainCircularDependency is "+a);
  }


}
