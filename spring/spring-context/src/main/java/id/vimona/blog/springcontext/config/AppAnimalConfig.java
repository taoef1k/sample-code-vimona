package id.vimona.blog.springcontext.config;

import id.vimona.blog.springcontext.domain.Animal;
import id.vimona.blog.springcontext.domain.Birds;
import id.vimona.blog.springcontext.domain.Mammals;
import id.vimona.blog.springcontext.domain.Reptiles;
import id.vimona.blog.springcontext.enums.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
public class AppAnimalConfig {

    @Autowired
    public void register(GenericApplicationContext context) {
        Animal animal = getAnimalInstance(AnimalType.BIRDS);
        context.registerBean("animal", Animal.class, () -> animal);
    }

    private Animal getAnimalInstance(AnimalType type) {
        switch (type) {
            case BIRDS:
                return new Birds();
            case MAMMALS:
                return new Mammals();
            case REPTILES:
                return new Reptiles();
        }
        throw new IllegalArgumentException("Invalid of Animal Type.");
    }
}
