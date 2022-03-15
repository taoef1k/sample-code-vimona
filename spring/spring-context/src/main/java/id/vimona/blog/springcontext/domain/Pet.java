package id.vimona.blog.springcontext.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class Pet {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Woody";
    }
}
