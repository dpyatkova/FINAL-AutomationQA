package dina.java.animal;

public class Cat extends Pet {
    public Cat() {
        this.type = "cat";
    }

    @Override
    public void feed() {
        System.out.println("Cat feed: Chrum-Chrum");
    }

    @Override
    public void voice() {
        System.out.println("Cat voice: Meow-Meow");
    }

    @Override
    public void run() {
        System.out.println("Cat run: Step, step, jump");

    }
}
