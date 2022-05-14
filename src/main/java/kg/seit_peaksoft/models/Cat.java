package kg.seit_peaksoft.models;

import kg.seit_peaksoft.interfaces.Animal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author seiitbeknarynbaev
 */
@Getter
@Setter
@ToString
public class Cat implements Animal {

    @Value("${cat.breed}")
    private String breed;
    @Value("${cat.color}")
    private String color;

    @PostConstruct
    @Override
    public void animalPlus() {
        System.out.println("Doing cat initialisation");
    }

    @PreDestroy
    @Override
    public void animalMinus() {
        System.out.println("Doing cat destruction");
    }
}
