package de.propra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(ScopeApplication.class, args);
    Set<Thread> threads = new HashSet<>();
    threads.add(new Thread(context.getBean(Printer.class)));
    threads.add(new Thread(context.getBean(Printer.class)));
    threads.add(new Thread(context.getBean(Printer.class)));
    threads.add(new Thread(context.getBean(Printer.class)));
    threads.add(new Thread(context.getBean(Printer.class)));
    threads.add(new Thread(context.getBean(Printer.class)));

    threads.forEach(Thread::start);
  }


}
