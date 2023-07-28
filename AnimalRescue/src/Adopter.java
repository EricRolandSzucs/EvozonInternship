public class Adopter extends Person{
    private double availableMoney;

    public Adopter(String name, double availableMoney) {
        super(name);
        this.availableMoney = availableMoney;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }
}
