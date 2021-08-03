package de.propra.fieldinjection;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Component;

@Component
public class SomeFieldDependency {


  public void ping() {
    System.out.println("Ping from "+getClass().getSimpleName());
  }

}
