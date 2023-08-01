import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Vegetables extends SimpleProduct {
    private int nutritionalQuality;
    private String producer;

    public Vegetables(String name, String unit, double weight, double ppu, LocalDate entryDate, LocalDate expiryDate, int nutritionalQuality, String producer) {
        super(name, unit, weight, ppu, entryDate, expiryDate);
        this.nutritionalQuality = nutritionalQuality;
        this.producer = producer;
    }

    private void dropPrice(LocalDateTime currentDate) {
        int weeksLeft = (int) currentDate.until(this.getExpiryDate(), ChronoUnit.WEEKS);
        if(weeksLeft <= 4){
            this.setPpu(this.getPpu() - this.getPpu() * (weeksLeft*5)/100);
        }
    }

    public String toCvs() {
        return this.getName() + ", " + this.getUnit() + ", " + this.getWeight() + ", " + this.getPpu() + ", " + this.getEntryDate() + ", " + this.getExpiryDate() + ", " + nutritionalQuality + ", " + producer;
    }

    public int getNutritionalQuality() {
        return nutritionalQuality;
    }

    public void setNutritionalQuality(int nutritionalQuality) {
        this.nutritionalQuality = nutritionalQuality;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
