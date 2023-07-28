package PetFoods;

public class DogFood extends PetFood{
    private String type;
    private int hunger;

    public DogFood(String name, double price, int quantity, String expiryDate, int availability, String type, int hunger) {
        super(name, price, quantity, expiryDate, availability);
        this.type = type;
        this.hunger = hunger;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
