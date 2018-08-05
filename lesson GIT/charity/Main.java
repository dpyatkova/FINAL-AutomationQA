package dina.java.charity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dina.java.animal.*;

class Animal {
    public String nickName;
    public String type;
    public String color;

    public Animal(String nickName, String type, String color) {
        this.nickName = nickName;
        this.type = type;
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> pool = new ArrayList<Animal>(){{
            add(new Animal("Tom","cat", "grey"));
            add(new Animal("Murka","cat", "black"));
            add(new Animal("John","dog", "white"));
            add(new Animal("Musya","cat", "pink"));
            add(new Animal("Ralf","dog", "red"));
            add(new Animal("Carry","cat", "blue"));
        }};

        Shelter shelter = new Shelter();
        for (Animal animal: pool) {
            Pet pet = null;

            if("cat".equals(animal.type)) {
                pet = new Cat();
            }
            else {
                pet = new Dog();
            }

            pet.setName(animal.nickName);
            pet.setColor(animal.color);

            shelter.putPet(pet);
        }

        Pet takenPet = shelter.takeRandomPet();
        System.out.println("Pet is taken: " + takenPet.getColor() + " " + takenPet.getType() + " " + takenPet.getName());
        System.out.println();

        String color;
        String type;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color: ");
        color = scanner.nextLine();

        System.out.print("Enter animal type: ");
        type = scanner.nextLine();

        System.out.println();

        takenPet = shelter.takeSpecifiedPet(color, type);

        if (takenPet == null) {
            System.out.println("We have no such pet in shelter!");
        }
        else {
            System.out.println("Found pet: " + takenPet.getColor() + " " + takenPet.getType() + " " + takenPet.getName());
        }
    }

}
