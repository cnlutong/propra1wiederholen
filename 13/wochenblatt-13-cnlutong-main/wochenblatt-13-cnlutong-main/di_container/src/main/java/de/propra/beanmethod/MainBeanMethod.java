package de.propra.beanmethod;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class MainBeanMethod {

  private final Random random;


  public MainBeanMethod(Random random) {
    this.random = random;
  }

  public void ping(int n) {
    System.out.println("Ping from "+getClass().getSimpleName());
    int rnd = random.nextInt(1000);
    System.out.println("Random Value: "+rnd);
  }

}
