package Persons;

import Animals.Animal;

public class Nurse extends Person {
    public Nurse(String name, String gender) {
        super(name, gender);
    }

    public void calmAnimal(Animal pet) {
        System.out.println('\n' + "Nurse currently petting " + pet.getName());
        pet.setMood(pet.getMood() + 1);
        pet.setFear(pet.getFear() + 2);
    }
}
