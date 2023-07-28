package Animals;

import Activities.Activity;
import PetFoods.PetFood;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, int weight, int healthLevel, int hungerLevel, int mood, PetFood food, Activity favoriteActivity, String breed) {
        super(name, age, weight, healthLevel, hungerLevel, mood, food, favoriteActivity);
        this.breed = breed;
    }

    public void sleep() {
        this.setMood(this.getMood() + 1);
        System.out.println("ZMeowZ");
        this.setSleeping(true);
    }

    public void eat(PetFood food) {
        System.out.println("Cat: Eh, this: " + food.getName() + " is okay..");
        if (this.getHungerLevel() != 10) {
            this.setHungerLevel(this.getHungerLevel() + 1);
            System.out.println("Hunger level now: " + this.getHungerLevel());
        } else
            System.out.println("I'm full but don't let that stop you");

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
