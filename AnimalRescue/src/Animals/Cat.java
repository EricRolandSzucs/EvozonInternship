package Animals;

import Activities.Activity;
import PetFoods.PetFood;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, int weight, int healthLevel, int hungerLevel, int mood,int fear, PetFood food, Activity favoriteActivity, String breed) {
        super(name, age, weight, healthLevel, hungerLevel, mood,fear, food, favoriteActivity);
        this.breed = breed;
    }

    public void sleep() {
        this.setMood(this.getMood() + 1);
        System.out.println("ZMeowZ");
        this.setSleeping(true);
    }

    public void eat(PetFood food) {
        if(food.getName().equals(this.getFood().getName())) {
            System.out.println(this.getName() + ": This is my favorite food :)");
            this.setMood(this.getMood()+1);
        }
        if(this.getHungerLevel() != 20) {
            System.out.println(this.getName() + " is eating\n" + this.getName() + ": This " + food.getName() + " " + food.getType() + " is perfect");
            this.setHungerLevel(this.getHungerLevel() + food.getHunger());
            this.setWeight(this.getWeight() + 1);
        } else
            System.out.println("Cat: Eh, this: " + food.getName() + " is okay..");
    }

    public void speak() {
        System.out.println("Meow");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
