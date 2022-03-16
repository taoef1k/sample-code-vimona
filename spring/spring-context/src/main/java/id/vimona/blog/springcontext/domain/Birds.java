package id.vimona.blog.springcontext.domain;

public class Birds extends Animal {
    private static final String ANIMAL_INFO = "Birds are warm-blooded vertebrates (vertebrates have backbones) and are the only animals with feathers. Although all birds have wings, a few species can't fly.";

    public Birds() {
        super.setDescription(ANIMAL_INFO);
    }
}
