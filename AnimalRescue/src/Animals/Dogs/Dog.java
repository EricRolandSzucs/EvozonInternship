package Animals.Dogs;

import Activities.Activity;
import Animals.Animal;
import PetFoods.PetFood;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, int weight, int healthLevel, int hungerLevel, int mood,int fear, PetFood food, Activity favoriteActivity, String breed) {
        super(name, age, weight, healthLevel, hungerLevel, mood, fear, food, favoriteActivity);
        this.breed = breed;
    }

    public void sleep() {
        System.out.println(this.getName() + " is having a nap *Zzz* ");
        this.setMood(this.getMood()+1);
        this.setSleeping(true);
    }

    public void eat(PetFood food) {
        if(this.getHungerLevel() != 10) {
            System.out.println(this.getName() + " is eating\n" + this.getName() + ": Yum this " + food.getName() + " " + food.getType() + " is delicious");
            this.setHungerLevel(this.getHungerLevel() + food.getHunger());
        } else
            System.out.println("Dog: I'm full :(");

    }

    public void speak() {
        System.out.println("Woof");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", weight=" + this.getWeight() +
                ", healthLevel=" + this.getHealthLevel() +
                ", hungerLevel=" + this.getHungerLevel() +
                ", mood=" + this.getMood() +
                ", food=" + this.getFood().getName() +
                ", sleeping=" + this.isSleeping() +
                '}' +'\n';
    }
}
