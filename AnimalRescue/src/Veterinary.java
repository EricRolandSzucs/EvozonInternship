public class Veterinary extends Person{
    private String specialty;

    public Veterinary(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
