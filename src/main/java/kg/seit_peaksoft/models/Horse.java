package kg.seit_peaksoft.models;

import kg.seit_peaksoft.interfaces.Animal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author seiitbeknarynbaev
 */
@Getter
@Setter
@ToString
public class Horse implements Animal {
    @Value("${horse.breed}")
    private String breed;
    @Value("${horse.color}")
    private String color;


    @PostConstruct
    @Override
    public void animalPlus() {
        System.out.println("Doing horse initialisation");
    }

    @PreDestroy
    @Override
    public void animalMinus() {
        System.out.println("Doing horse destruction");
    }
}
