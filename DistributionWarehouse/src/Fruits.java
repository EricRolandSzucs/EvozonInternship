import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Fruits extends SimpleProduct {
    private int nutritionalQuality;


    public Fruits(String name, String unit, double unitNumber, double weight, double ppu, LocalDate entryDate, LocalDate expiryDate, int nutritionalQuality) {
        super(name, unit, unitNumber, weight, ppu, entryDate, expiryDate);
        this.nutritionalQuality = nutritionalQuality;
    }

    public Fruits(String[] details) {
        super(details[0], details[1], Double.parseDouble(details[2]), Double.parseDouble(details[3]), Double.parseDouble(details[4]),
                LocalDate.parse(details[5]), LocalDate.parse(details[6]));
        nutritionalQuality = Integer.parseInt(details[7]);

    }

    public void dropPrice(LocalDateTime currentDate) {
        int weeksLeft = (int) currentDate.until(this.getExpiryDate(), ChronoUnit.WEEKS);
        if(weeksLeft <= 5){
          this.setPpu(this.getPpu() - this.getPpu() * weeksLeft/10);
        }
    }

    public String toCvs() {
        return this.getName() + ", " + this.getUnit() + ", " + this.getUnitNumber() + ", " + this.getWeight() + ", " + this.getPpu() + ", " + this.getEntryDate() + ", " + this.getExpiryDate() + ", " + nutritionalQuality;
    }

    public int getNutritionalQuality() {
        return nutritionalQuality;
    }

    public void setNutritionalQuality(int nutritionalQuality) {
        this.nutritionalQuality = nutritionalQuality;
    }

}
