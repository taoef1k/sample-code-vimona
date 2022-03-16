package id.vimona.blog.springcontext;

import id.vimona.blog.springcontext.domain.Animal;
import id.vimona.blog.springcontext.domain.Car;
import id.vimona.blog.springcontext.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringContextApplication implements ApplicationRunner {

    @Autowired
    private Car car;

    @Autowired
    private Pet pet;

    @Autowired
    private AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SpringContextApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Car brand : " + car.getBrand());
        System.out.println("Pet name : " + pet.getName());
        Animal animal = context.getBean("animal", Animal.class);
        System.out.println("Animal info : " + animal.getDescription());
    }
}
