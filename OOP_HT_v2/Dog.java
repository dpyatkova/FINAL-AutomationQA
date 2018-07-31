package OOP_HT_v2;

public class Dog extends Pet implements FightActions {
    @Override
    public void feed() {
        System.out.println("Dog feed: Chafk-chafk");
    }
    @Override
    public void voice() {
        System.out.println("Dog voice: Woof-woof");
    }

    @Override
    public void run() {
        System.out.println("Dog run: Step, step, jump");

    }

    @Override
    public void attack() {
        System.out.println("Dog \"" + getName() +"\" growls and jumps");
    }

    @Override
    public void defence() {
        System.out.println("Dog \"" + getName() +"\"lays down");

    }
}
