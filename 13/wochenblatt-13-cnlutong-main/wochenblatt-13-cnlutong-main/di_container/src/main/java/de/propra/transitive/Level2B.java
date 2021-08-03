package de.propra.transitive;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Component;
@Component
public class Level2B {




  public void ping(int n) {
    System.out.print(IntStream.range(0, n).mapToObj(x -> " ").collect(Collectors.joining()));
    System.out.println("Ping from "+getClass().getSimpleName());
  }
}
