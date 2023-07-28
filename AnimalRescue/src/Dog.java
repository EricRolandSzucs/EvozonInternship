public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, int weight, int healthLevel, int hungerLevel, int mood, PetFood food, Activity favoriteActivity, String breed) {
        super(name, age, weight, healthLevel, hungerLevel, mood, food, favoriteActivity);
        this.breed = breed;
    }

    public void sleep() {
        this.setMood(this.getMood()+1);
        System.out.println("Zzz");
        this.setSleeping(true);
    }

    public void eat(PetFood food) {
        System.out.println("Dog: Yum, this: " + food.getName() + " is delicious");
        if(this.getHungerLevel() != 10) {
            this.setHungerLevel(this.getHungerLevel() + 1);
            System.out.println("Hunger level now: " + this.getHungerLevel());
        } else
            System.out.println("I'm full :(");

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
}
