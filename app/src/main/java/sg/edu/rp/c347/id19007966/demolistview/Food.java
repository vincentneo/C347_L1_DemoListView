package sg.edu.rp.c347.id19007966.demolistview;

public class Food {
    private String name;
    private boolean star;

    public Food(String name, boolean star) {
        this.star = star;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isStar() {
        return star;
    }
}
