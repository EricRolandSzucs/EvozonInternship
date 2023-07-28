import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        String expiry = "2024-01-18 00:00:00.0";
        LocalDateTime datetime = LocalDateTime.parse(expiry, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));
        PetFood food = new PetFood("Pedigree", 3.14,100,datetime,50);
        Activity activity = new Activity("Running");
        Dog dog = new Dog("Janos", 10, 6, 2,6,food,activity);
        Adopter adopter = new Adopter("Gregorian", 2000);
        Veterinary veterinary = new Veterinary("Strange", "Cardiology");
    }
}
