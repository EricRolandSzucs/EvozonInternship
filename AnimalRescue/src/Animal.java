public class Animal {
    private String name;
    private int age;
    // 1 - 10
    private int healthLevel;
    // 1 - 10
    private int hungerLevel;
    // 1 - 10
    private int mood;

    private PetFood food;
    private Activity favoriteActivity;

    public Animal(String name, int age, int healthLevel, int hungerLevel, int mood, PetFood food, Activity favoriteActivity) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.mood = mood;
        this.food = food;
        this.favoriteActivity = favoriteActivity;
    }

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
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
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
}
