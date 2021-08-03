package de.propra.transitive;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Component;

@Component
public class MainTransitive {

  private final Level1A a;
  private final Level1B b;

  public MainTransitive(Level1A a, Level1B b) {
    this.a = a;
    this.b = b;
  }

  public void ping(int n) {
    System.out.print(IntStream.range(0, n).mapToObj(x -> " ").collect(Collectors.joining()));
    System.out.println("Ping from "+getClass().getSimpleName());
    a.ping(n+1);
    b.ping(n+1);
  }

}
