public class Adopter extends Person {
    private double availableMoney;
    private Animal pet;

    public Adopter(String name, String gender, double availableMoney) {
        super(name, gender);
        this.availableMoney = availableMoney;
    }

    public void adopt(Animal pet) {
        this.pet = pet;
        System.out.println(this.getName() + ": I own you now!");
    }

    public void changePetName(Animal pet, String name) {
        pet.setName(name);
    }

    public void feedPet(Animal pet, PetFood food) {
        pet.eat(food);
        pet.setHungerLevel(pet.getHungerLevel()+1);
    }

    public void playWithPet(Animal pet, Activity activity) {
        pet.setHealthLevel(pet.getHealthLevel()+1);
        pet.setMood(pet.getMood()+1);
    }

    public void walkPet(Animal pet) {
        pet.setHealthLevel(pet.getHealthLevel()+1);
        pet.setMood(pet.getMood()+1);
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
