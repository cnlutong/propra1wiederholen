package de.propra.multiconstructor;

import org.springframework.stereotype.Component;

@Component
public class DependencyWithDefaultConstructor {

  private final String msg;

  public DependencyWithDefaultConstructor() {
    this("default constructor used");
  }

  public DependencyWithDefaultConstructor(String msg) {
    this.msg = msg;
  }

  public void ping() {
    System.out.print("Ping from "+getClass().getSimpleName());
    System.out.println(" Msg:"+msg);
  }



}
