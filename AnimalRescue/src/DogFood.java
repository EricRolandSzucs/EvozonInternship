import java.time.LocalDateTime;

public class DogFood extends PetFood{
    private String type;

    public DogFood(String name, double price, int quantity, String expiryDate, int availability) {
        super(name, price, quantity, expiryDate, availability);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
