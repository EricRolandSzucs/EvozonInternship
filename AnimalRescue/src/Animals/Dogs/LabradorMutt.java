package Animals.Dogs;

import Activities.Activity;
import PetFoods.DogFood;
import PetFoods.PetFood;

public class LabradorMutt extends Dog {
    public String parentRace;

    public LabradorMutt(String name, int age, int weight, int healthLevel, int hungerLevel, int mood,int fear, PetFood food, Activity favoriteActivity, String breed) {
        super(name, age, weight, healthLevel, hungerLevel, mood, fear, food, favoriteActivity, breed);
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is sleeping blissfully *Zzz* ");
        this.setMood(this.getMood()+1);
        this.setSleeping(true);
    }

    @Override
    public void eat(DogFood food) {
        if(food.getName().equals(this.getFood().getName())) {
            System.out.println(this.getName() + ": This is my favorite food :)");
            this.setMood(this.getMood()+1);
        }
        if(this.getHungerLevel() != 20) {
            System.out.println(this.getName() + " is eating\n" + this.getName() + ": This " + food.getName() + " " + food.getType() + " is perfect");
            this.setHungerLevel(this.getHungerLevel() + food.getHunger());
            this.setWeight(this.getWeight() + 1);
        } else
            System.out.println("Dog: :( too much food");

    }

    @Override
    public void speak() {
        System.out.println("Ruff");
    }

    @Override
    public String toString() {
        return "LabradorMutt{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", weight=" + this.getWeight() +
                ", healthLevel=" + this.getHealthLevel() +
                ", hungerLevel=" + this.getHungerLevel() +
                ", mood=" + this.getMood() +
                ", fear=" + this.getFear() +
                ", food=" + this.getFood().getName() +
                ", sleeping=" + this.isSleeping() +
                ", parent race=" + this.getParentRace() +
                '}' +'\n';
    }

    public String getParentRace() {
        return parentRace;
    }

    public void setParentRace(String parentRace) {
        this.parentRace = parentRace;
    }
}
