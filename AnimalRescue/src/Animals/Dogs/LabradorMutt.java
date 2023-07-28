package Animals.Dogs;

import Activities.Activity;
import PetFoods.PetFood;

public class LabradorMutt extends Dog {
    public String parentRace;

    public LabradorMutt(String name, int age, int weight, int healthLevel, int hungerLevel, int mood, PetFood food, Activity favoriteActivity, String breed) {
        super(name, age, weight, healthLevel, hungerLevel, mood, food, favoriteActivity, breed);
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is sleeping blissfully *Zzz* ");
        this.setMood(this.getMood()+1);
        this.setSleeping(true);
    }

    @Override
    public void eat(PetFood food) {
        if(this.getHungerLevel() != 20) {
            System.out.println("Dog: This " + food.getName() + " " + food.getType() + " is perfect");
            this.setHungerLevel(this.getHungerLevel() + 1);
        } else
            System.out.println("Dog: :( too much food");

    }

    @Override
    public void speak() {
        System.out.println("Ruff");
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
