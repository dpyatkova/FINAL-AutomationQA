package dina.java.animal;

public class Dog extends Pet {
    public Dog() {
        this.type = "dog";
    }

    @Override
    public void feed() {
        System.out.println("Dog feed: Chafk-Chafk");
    }

    @Override
    public void voice() {
        System.out.println("Dog voice: Woof-Woof");
    }

    @Override
    public void run() {
        System.out.println("Cat run: Step, step, jump");

    }
}
