package OOP_HT_v2;

public class Main {
    public static void displayData(Pet x) {
        System.out.println("Name: " + x.getName());
        System.out.println("Owner: " + x.getOwner());
        System.out.println("Location: " + x.getLocation());
        System.out.println("Sex: " + x.getSex());

        System.out.println();

        x.feed();
        x.voice();
        x.run();

        System.out.println("+----------+");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Tom-Tom");
        tom.setOwner("Manya");
        tom.setLocation("Pushkina street");

        displayData(tom);

        Cat murka = new Cat();
        murka.setName("Murka");
        murka.setOwner("Vanya");
        murka.setLocation("Sokolova street");
        murka.setSex("Female");

        displayData(murka);

        Dog dog = new Dog();
        dog.setLocation("Domestic");

        displayData(dog);

        Dog john = new Dog();
        john.setName("John");

        displayData(john);

        for(int i = 0;i< 3; ++i)

        {
            tom.attack();
            murka.defence();

            murka.attack();
            tom.defence();

            tom.attack();
            john.defence();

            dog.attack();
            murka.defence();
        }

    }

}

