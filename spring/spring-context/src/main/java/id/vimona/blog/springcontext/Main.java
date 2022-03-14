package id.vimona.blog.springcontext;

import id.vimona.blog.springcontext.config.AppConfig;
import id.vimona.blog.springcontext.domain.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);

        System.out.println("Car brand : " + car.getBrand());
    }
}
