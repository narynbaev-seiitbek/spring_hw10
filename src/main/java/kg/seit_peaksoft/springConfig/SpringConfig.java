package kg.seit_peaksoft.springConfig;

import kg.seit_peaksoft.models.Cat;
import kg.seit_peaksoft.models.Horse;
import kg.seit_peaksoft.models.Person;
import org.springframework.context.annotation.*;

/**
 * @author seiitbeknarynbaev
 */
@Configuration
@ComponentScan("kg.seit_peaksoft.models")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Horse horse() {
        return new Horse();
    }

    @Bean("person1")
    public Person person1() {
        return new Person("Azat",18,horse());
    }

    @Bean("person2")
    public Person person2() {
        return new Person("Kuba",25,cat());
    }



}
