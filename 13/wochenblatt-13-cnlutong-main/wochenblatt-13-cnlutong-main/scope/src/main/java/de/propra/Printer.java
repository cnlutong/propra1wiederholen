package de.propra;

import java.util.Random;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Printer implements Runnable {

  private final Greeter greeter;

  public Printer(Greeter greeter) {
    this.greeter = greeter;
    int n = new Random().nextInt(100);
    greeter.setPrefix("From " + n + ":" + "Hallo");
  }

  @Override
  public void run() {
    greeter.print("Propra");
  }
}
