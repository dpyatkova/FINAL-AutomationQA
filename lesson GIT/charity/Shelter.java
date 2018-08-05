package dina.java.charity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dina.java.animal.*;

public class Shelter {
    private List<Pet> animalPool = new ArrayList<>();
    private Random rnd = new Random();

    public void putPet(Pet pet) {
        animalPool.add(pet);

        System.out.println("Added " + pet.getColor() + " " + pet.getType() + " " + pet.getName());
        System.out.println("Pets in shelter: " + animalPool.size());
        System.out.println();
    }

    public Pet takeRandomPet() {
        if (animalPool.isEmpty()) {
            System.out.println("Shelter is empty!");
            return null;
        }

        int animalID = rnd.nextInt(animalPool.size());
        Pet takenPet = animalPool.get(animalID);

        animalPool.remove(animalID);

        return takenPet;
    }

    public Pet takeSpecifiedPet(String color, String type) {
        Pet found = null;

        if (animalPool.isEmpty()) {
            System.out.println("Shelter is empty!");
            return null;
        }

        for (Pet pet: animalPool) {
            if (color.equals(pet.getColor()) && type.equals(pet.getType())) {
                found = pet;
                break;
            }
        }

        return found;
    }
}
