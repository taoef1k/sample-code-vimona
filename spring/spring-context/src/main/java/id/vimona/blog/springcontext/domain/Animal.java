package id.vimona.blog.springcontext.domain;

public abstract class Animal {
    private String description;

    public abstract String description();

    public String getInfo() {
        this.description = description();
        return this.description;
    }
}
