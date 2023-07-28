public class Game {
    private Adopter adopter;
    private Dog dog;
    private Veterinary veterinary;

    public Game(Adopter adopter, Dog dog, Veterinary veterinary) {
        this.adopter = adopter;
        this.dog = dog;
        this.veterinary = veterinary;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Veterinary getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(Veterinary veterinary) {
        this.veterinary = veterinary;
    }
}
