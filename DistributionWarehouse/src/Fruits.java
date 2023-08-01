import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Fruits extends SimpleProduct {
    private int nutritionalQuality;


    public Fruits(String name, String unit, double weight, double ppu, LocalDate entryDate, LocalDate expiryDate, int nutritionalQuality) {
        super(name, unit, weight, ppu, entryDate, expiryDate);
        this.nutritionalQuality = nutritionalQuality;
    }

    public void dropPrice(LocalDateTime currentDate) {
        int weeksLeft = (int) currentDate.until(this.getExpiryDate(), ChronoUnit.WEEKS);
        if(weeksLeft <= 5){
          this.setPpu(this.getPpu() - this.getPpu() * weeksLeft/10);
        }
    }

    public String toCvs() {
        return this.getName() + ", " + this.getUnit() + ", " + this.getWeight() + ", " + this.getPpu() + ", " + this.getEntryDate() + ", " + this.getExpiryDate() + ", " + nutritionalQuality;
    }

    public int getNutritionalQuality() {
        return nutritionalQuality;
    }

    public void setNutritionalQuality(int nutritionalQuality) {
        this.nutritionalQuality = nutritionalQuality;
    }
}
