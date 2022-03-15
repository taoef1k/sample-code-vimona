package id.vimona.blog.springcontext.config;

import id.vimona.blog.springcontext.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "id.vimona.blog.springcontext.domain")
public class AppConfig {
    @Bean
    Car car() {
        var car = new Car();
        car.setBrand("Honda");
        return car;
    }
}
