package Animals;

import Activities.Activity;
import PetFoods.PetFood;

abstract public class Animal {
    private String name;
    private int age;
    private int weight;
    // 1 - 20
    private int healthLevel;
    // 1 - 20
    private int hungerLevel;
    // 1 - 20
    private int mood;
    // 1 - 20
    private int fear;

    private PetFood food;
    private Activity favoriteActivity;
    private boolean sleeping;

    public Animal(String name, int age, int weight, int healthLevel, int hungerLevel, int mood, int fear, PetFood food, Activity favoriteActivity) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.mood = mood;
        this.fear = fear;
        this.food = food;
        this.favoriteActivity = favoriteActivity;
    }

    abstract public void sleep();

    abstract public void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(this.getName() + " age: " + this.getAge());
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {

        this.healthLevel = Math.min(healthLevel, 20);
        System.out.println(this.getName() + " health level: " + this.getHealthLevel());
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = Math.min(hungerLevel, 20);
        System.out.println(this.getName() + " hunger level: " + this.getHungerLevel());
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = Math.min(mood, 20);
        System.out.println(this.getName() + " mood level: " + this.getMood());
    }

    public PetFood getFood() {
        return food;
    }

    public void setFood(PetFood food) {
        this.food = food;
    }

    public Activity getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(Activity favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        System.out.println(this.getName() + " weight: " + this.getWeight());
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public int getFear() {
        return fear;
    }

    public void setFear(int fear) {
        this.fear = fear;
        System.out.println(this.getName() + " fear: " + this.getFear());
    }
}
