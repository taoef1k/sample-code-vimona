package id.vimona.blog.springcontext.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Pet {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Woody";
    }

    public String getName() {
        return name;
    }
}
