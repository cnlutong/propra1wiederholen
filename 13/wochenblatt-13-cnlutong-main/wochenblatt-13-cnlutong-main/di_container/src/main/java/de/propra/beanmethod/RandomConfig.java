package de.propra.beanmethod;

import java.util.Random;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {

  @Bean
  public Random createRandom() {
    return new Random();
  }

}
