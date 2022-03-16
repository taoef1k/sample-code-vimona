package id.vimona.blog.springcontext.config;

import id.vimona.blog.springcontext.domain.Animal;
import id.vimona.blog.springcontext.domain.Birds;
import id.vimona.blog.springcontext.domain.Mammals;
import id.vimona.blog.springcontext.domain.Reptiles;
import id.vimona.blog.springcontext.enums.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppAnimalConfig {

    @Value("${animal.type}")
    private String animalType;

    @Autowired
    public void register(AnnotationConfigApplicationContext context) {
        Animal animal = getAnimalInstance();
        context.registerBean("animal", Animal.class, () -> animal);
    }

    private Animal getAnimalInstance() {
        if (AnimalType.BIRDS.name().equals(animalType)) {
            return new Birds();
        } else if (AnimalType.MAMMALS.name().equals(animalType)) {
            return new Mammals();
        } else if (AnimalType.REPTILES.name().equals(animalType)) {
            return new Reptiles();
        }
        throw new IllegalArgumentException("Invalid of Animal Type.");
    }
}
