public class App {
    public static void main(String[] args) {
        Adopter girl = new Adopter("Suzie", "Female", 0);
        girl.setHeight("Small");
        girl.setHairColor("Red");
        girl.setLikes("Animals");

        Adopter father = new Adopter("Gregorian", "Male", 20000);
        father.setGender("Male");
        father.setHeight("Tall");

        DogFood food = new DogFood("Pedigree", 3.14,100,"2024-01-18 00:00:00.0",50);
        Activity running = new Activity("Running", "Outside");
        Dog dog = new Dog("Janos", 10, 10, 2, 2,2,food,running, "half breed labrador");

        girl.adopt(dog);
        girl.changePetName(dog, "Janoska");

        girl.feedPet(dog, food);

        dog.setAge(dog.getAge()+4);
        dog.setWeight(dog.getWeight()+10);
        dog.setMood(dog.getMood()+4);

        girl.playWithPet(dog, running);

        // BRING PET TO VET

        Veterinary veterinary = new Veterinary("Strange", "Male", "Cardiology");
        Nurse nurse = new Nurse("Rodica", "Female");
        veterinary.vaccinate(dog);
        nurse.calmAnimal(dog);
        veterinary.deworm(dog);

        food.setType("wet");

        girl.feedPet(dog, food);

        dog.setWeight(dog.getWeight()+2);

        food.setType("special low calorie food"); // Do something with classes here or something

        girl.feedPet(dog, food);
        girl.walkPet(dog);
        dog.sleep();

        // girl - do homework

        dog.setSleeping(false);
        Activity play = new Activity("Playing with the ball", "In garden");
        girl.walkPet(dog);
        girl.feedPet(dog, food);
        dog.sleep();

    }
}
