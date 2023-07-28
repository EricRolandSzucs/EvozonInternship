package Animals.Dogs;

import Activities.Activity;
import PetFoods.DogFood;
import PetFoods.PetFood;

public class Chihuahua extends Dog {

    public int barkLoudness;
    public int annoyingness;

    public Chihuahua(String name, int age, int weight, int healthLevel, int hungerLevel, int mood,int fear, PetFood food, Activity favoriteActivity, String breed) {
        super(name, age, weight, healthLevel, hungerLevel, mood, fear, food, favoriteActivity, breed);
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is snoring *Zzz* ");
        this.setMood(this.getMood()+1);
        this.setSleeping(true);
    }

    @Override
    public void eat(DogFood food) {
        if(this.getHungerLevel() != 20) {
            System.out.println(this.getName() + " is eating\n" + this.getName() + ": This " + food.getName() + " " + food.getType() + " is okay");
            this.setHungerLevel(this.getHungerLevel() + food.getHunger());
        } else
            System.out.println("Dog: No more");

    }

    @Override
    public void speak() {
        System.out.println("YAPPPYAPP");
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
                ", bark loudness=" + this.getBarkLoudness() +
                ", annoyingness=" + this.getAnnoyingness() +
                '}' +'\n';
    }

    public int getBarkLoudness() {
        return barkLoudness;
    }

    public void setBarkLoudness(int barkLoudness) {
        this.barkLoudness = barkLoudness;
    }

    public int getAnnoyingness() {
        return annoyingness;
    }

    public void setAnnoyingness(int annoyingness) {
        this.annoyingness = annoyingness;
    }
}
