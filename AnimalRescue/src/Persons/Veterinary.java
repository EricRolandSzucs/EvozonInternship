package Persons;

import Animals.Animal;

public class Veterinary extends Person {
    private String specialty;

    public Veterinary(String name, String gender, String specialty) {
        super(name, gender);
        this.specialty = specialty;
    }

    public void vaccinate(Animal pet) {
        System.out.println('\n' + "Veterinary currently vaccinating " + pet.getName());
        pet.setHealthLevel(pet.getHealthLevel()+1);
        pet.setMood(pet.getMood() - 1);
    }

    public void deworm(Animal pet) {
        System.out.println('\n' + "Veterinary currently deworming " + pet.getName());
        pet.setHealthLevel(pet.getHealthLevel()+1);
        pet.setMood(pet.getMood() - 1);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

}
