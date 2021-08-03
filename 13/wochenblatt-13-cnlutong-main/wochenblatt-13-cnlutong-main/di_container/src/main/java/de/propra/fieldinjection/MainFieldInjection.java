package de.propra.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MainFieldInjection {

  @Autowired
  private SomeFieldDependency dep;

  public void ping(int n) {
    System.out.println("Ping from " + getClass().getSimpleName());
    dep.ping();
  }


}
