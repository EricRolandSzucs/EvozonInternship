import Activities.Activity;
import Animals.Dogs.Dog;
import Animals.Dogs.LabradorMutt;
import Persons.Adopter;
import Persons.Nurse;
import Persons.Student;
import Persons.Veterinary;
import PetFoods.PetFood;

public class App {
    public static void main(String[] args) {
        Student girl = new Student("Suzie", "Female", 0);
        girl.setHeight("Small");
        girl.setHairColor("Red");
        girl.setLikes("Animals");
        girl.setAge(7);
        System.out.println(girl.toString());

        Adopter father = new Adopter("Gregorian", "Male", 20000);
        father.setGender("Male");
        father.setHeight("Tall");
        father.setAge(40);
        System.out.println(father.toString());

        father.setLocation("the Animal shelter");
        girl.setLocation("the Animal shelter");

        PetFood food = new PetFood("Pedigree", 3.14,100,"2024-01-18 00:00:00.0",50, "For Puppies", 1,5);
        Activity running = new Activity("Running", "Outside");
        Activity walking = new Activity("Walking", "Outside");
        LabradorMutt dog = new LabradorMutt("Janos", 10, 10, 2, 2,2,food,running, "half breed labrador");
        dog.setParentRace("Pit-bull");

        girl.adopt(dog);
        System.out.println(dog.toString());
        father.payAdoptionFee(250);
        girl.changePetName(dog, "Janoska");

        girl.setLocation("Home");
        father.setLocation("Home");

        girl.feedPet(dog, food);

        dog.setAge(dog.getAge()+4);
        dog.setWeight(dog.getWeight()+10);
        dog.setMood(dog.getMood()+4);

        girl.playWithPet(dog, running);

        girl.setLocation("the Veterinary Cabinet");

        Veterinary veterinary = new Veterinary("Strange", "Male", "Cardiology");
        System.out.println(veterinary.toString());
        veterinary.setLocation("Clinic");
        Nurse nurse = new Nurse("Rodica", "Female");
        System.out.println(nurse.toString());
        nurse.setLocation("Clinic");

        veterinary.vaccinate(dog);
        nurse.calmAnimal(dog);
        veterinary.deworm(dog);

        girl.setLocation("Home");
        food.setType("Wet");
        food.setHunger(2);
        food.setWeight(10);

        girl.feedPet(dog, food);

        dog.setWeight(dog.getWeight()+2);

        food.setType("Special low calorie food");
        food.setHunger(1);
        food.setWeight(3);

        Activity play = new Activity("Playing with the ball", "In garden");
        for(int i=1;i<5;i++) {
            System.out.println("-------------DAY "+i+":-------------");
            girl.feedPet(dog, food);
            girl.playWithPet(dog, walking);
            dog.sleep();
            girl.doHomework();
            dog.setSleeping(false);

            girl.playWithPet(dog, play);
            girl.feedPet(dog, food);
            dog.sleep();
        }

    }
}
