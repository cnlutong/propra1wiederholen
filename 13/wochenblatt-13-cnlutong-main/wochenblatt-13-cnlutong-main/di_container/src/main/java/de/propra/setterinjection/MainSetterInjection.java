package de.propra.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainSetterInjection {

  private SomeSetterDependency dep;

  @Autowired
  public void setDep(SomeSetterDependency dep) {
    this.dep = dep;
  }

  public void ping(int n) {
    System.out.println("Ping from " + getClass().getSimpleName());
    dep.ping();
  }


}
