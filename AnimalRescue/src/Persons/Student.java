package Persons;

public class Student extends Adopter{
    public Student(String name, String gender, double availableMoney) {
        super(name, gender, availableMoney);
    }

    public void doHomework() {
        System.out.println('\n' + this.getName() + " is doing homework");
    }
}
