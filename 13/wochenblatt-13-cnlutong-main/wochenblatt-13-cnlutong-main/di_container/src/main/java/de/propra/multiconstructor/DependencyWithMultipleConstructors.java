package de.propra.multiconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyWithMultipleConstructors {

  private final int n;
  private final DependencyWithDefaultConstructor dep;

  public DependencyWithMultipleConstructors(int n) {
    this.n = n;
    this.dep = null;
  }

  @Autowired
  public DependencyWithMultipleConstructors(DependencyWithDefaultConstructor s) {
    this.dep = s;
    this.n = 0;
  }

  public void ping() {
    System.out.print("Ping from "+getClass().getSimpleName());
    if (dep != null) {
      System.out.println();
      dep.ping();
    }
    else {
      System.out.println("Dependency not set");
    }
  }


}
