package id.vimona.blog.springcontext.domain;

public class Reptiles extends Animal {
    private static final String ANIMAL_INFO = "Reptiles are cold-blooded vertebrates. (Vertebrates have backbones.) They have dry skin covered with scales or bony plates and usually lay soft-shelled eggs.";

    @Override
    public String description() {
        return ANIMAL_INFO;
    }
}
