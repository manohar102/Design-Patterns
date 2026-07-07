package facadepattern;

public class Projector {
    private String description;

    public Projector(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode (16:9 aspect ratio)");
    }
}
