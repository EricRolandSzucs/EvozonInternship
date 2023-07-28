public class Nurse extends Person {
    public Nurse(String name, String gender) {
        super(name, gender);
    }

    public void calmAnimal(Animal pet) {
        pet.setMood(pet.getMood() + 1);
    }
}
