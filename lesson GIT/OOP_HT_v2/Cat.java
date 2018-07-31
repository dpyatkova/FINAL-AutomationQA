package OOP_HT_v2;

public class Cat extends Pet implements FightActions {
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

    @Override
    public void attack() {
        System.out.println("Cat \"" + getName() +"\" dugs his claws into another cat");
    }

    @Override
    public void defence() {
        System.out.println("Cat \"" + getName() +"\" runs away");
    }
}
