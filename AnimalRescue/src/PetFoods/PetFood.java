package PetFoods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PetFood {
    private String name;
    private double price;
    private int quantity;
    private LocalDateTime expiryDate;
    private int availability;
    private String type;
    private int hunger;

    public PetFood(String name, double price, int quantity, String expiryDate, int availability) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = LocalDateTime.parse(expiryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
