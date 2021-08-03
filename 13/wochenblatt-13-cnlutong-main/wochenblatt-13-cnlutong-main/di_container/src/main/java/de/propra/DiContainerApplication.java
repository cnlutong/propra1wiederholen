package de.propra;

import de.propra.beanmethod.MainBeanMethod;
import de.propra.circular.MainCircularDependency;
import de.propra.fieldinjection.MainFieldInjection;
import de.propra.multiconstructor.MainConstructor;
import de.propra.multiplecomponents.MainMultipleComponents;
import de.propra.setterinjection.MainSetterInjection;
import de.propra.transitive.MainTransitive;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DiContainerApplication {

  public static void main(String[] args) {
    SpringApplication.run(DiContainerApplication.class, args);
  }

  @Bean
  CommandLineRunner init(MainCircularDependency x) {
    return args -> {
      x.ping(0);
    };
  }


}
