package id.vimona.blog.springcontext.domain;

public class Mammals extends Animal {
    private static final String ANIMAL_INFO = "Mammals are warm-blooded vertebrates (vertebrates have backbones) with hair. They feed their young with milk and have a more well-developed brain than other types of animals.  ";

    @Override
    public String description() {
        return ANIMAL_INFO;
    }
}
