package de.propra.greeter_di;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

  private final Greeter greeter;

  public MyRunner(Greeter greeter) {
    this.greeter = greeter;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(greeter.greet("Propra"));
  }
}
