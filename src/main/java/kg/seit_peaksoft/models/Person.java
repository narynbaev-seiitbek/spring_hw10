package kg.seit_peaksoft.models;

import kg.seit_peaksoft.interfaces.Animal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author seiitbeknarynbaev
 */
@Getter
@Setter
@ToString
@Component

public class Person {
    private String name;
    private int age;

    private Animal animal;

    public Person() {
    }


    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }
}
