package Persons;

import Activities.Activity;
import Animals.Animal;
import Animals.Dogs.Dog;
import PetFoods.DogFood;
import PetFoods.PetFood;

public class Adopter extends Person {
    private double availableMoney;
    private Animal pet;

    public Adopter(String name, String gender, double availableMoney) {
        super(name, gender);
        this.availableMoney = availableMoney;
    }

    public void adopt(Animal pet) {
        this.pet = pet;
        System.out.println(this.getName() + " adopts an animal.");
    }

    public void payAdoptionFee(double cost) {
        availableMoney = availableMoney - cost;
        System.out.println(this.getName() + " pays the adoption fee." + '\n');
    }

    public void changePetName(Animal pet, String name) {
        System.out.println(this.getName() + " changed the name of " + pet.getName() + " to " + name);
        pet.setName(name);
        System.out.println(pet.toString());
    }

    public void feedDog(Dog pet, DogFood food) {
        System.out.println(this.getName() + " is feeding " + pet.getName());
        pet.eat(food);
        food.setQuantity(food.getQuantity()-1);
        System.out.println(pet.toString());
    }

    public void playWithPet(Animal pet, Activity activity) {
        System.out.println('\n' + this.getName() + " is doing the activity: " + activity.getName() + " with " + pet.getName());
        pet.setHealthLevel(pet.getHealthLevel()+1);
        pet.setMood(pet.getMood()+1);
        System.out.println();
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public Animal getPet() {
        return pet;
    }

}
