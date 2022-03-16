package id.vimona.blog.springcontext;

import id.vimona.blog.springcontext.config.AppConfig;
import id.vimona.blog.springcontext.domain.*;
import id.vimona.blog.springcontext.enums.AnimalType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        System.out.println("Car brand : " + car.getBrand());

        Pet pet = context.getBean(Pet.class);
        System.out.println("Pet name : " + pet.getName());

        context = registerBeans(AnimalType.BIRDS);
        Animal animal = context.getBean(Animal.class);
        System.out.println("Animal description : " + animal.getDescription());

        context = registerBeans(AnimalType.MAMMALS);
        animal = context.getBean(Animal.class);
        System.out.println("Animal description : " + animal.getDescription());

        context = registerBeans(AnimalType.REPTILES);
        animal = context.getBean(Animal.class);
        System.out.println("Animal description : " + animal.getDescription());
    }

    private static AnnotationConfigApplicationContext registerBeans(AnimalType type) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Animal animal = getAnimalInstance(type);
        context.registerBean(Animal.class, () -> animal);
        return context;
    }

    private static Animal getAnimalInstance(AnimalType type) {
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
