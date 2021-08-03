package de.propra.greeter_di;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GreeterApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(GreeterApplication.class, args);
  }



}
