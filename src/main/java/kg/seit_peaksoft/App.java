package kg.seit_peaksoft;


import kg.seit_peaksoft.models.Cat;
import kg.seit_peaksoft.models.Horse;
import kg.seit_peaksoft.models.Person;
import kg.seit_peaksoft.springConfig.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);

        Horse horse = context.getBean("horse", Horse.class);
        System.out.println(horse);

        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);

        context.close();


    }
}
