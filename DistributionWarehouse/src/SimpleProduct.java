import java.time.LocalDate;
import java.time.LocalDateTime;

public class SimpleProduct {
    private String name;
    private String unit;
    private double unitNumber;
    private double weight;
    private double ppu;
    private LocalDate entryDate;
    private LocalDate expiryDate;

    public SimpleProduct(String name, String unit, double unitNumber, double weight, double ppu, LocalDate entryDate, LocalDate expiryDate) {
        this.name = name;
        this.unit = unit;
        this.unitNumber = unitNumber;
        this.weight = weight;
        this.ppu = ppu;
        this.entryDate = entryDate;
        this.expiryDate = expiryDate;
    }

    public SimpleProduct(String[] details) {
        this.name = details[0];
        this.unit = details[1];
        this.unitNumber = Double.parseDouble(details[2]);
        this.weight = Double.parseDouble(details[3]);
        this.ppu = Double.parseDouble(details[4]);
        this.entryDate = LocalDate.parse(details[5]);
        this.expiryDate = LocalDate.parse(details[6]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getPpu() {
        return ppu;
    }

    public void setPpu(double ppu) {
        this.ppu = ppu;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(double unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toCvs() {
        return name + ", " + unit + ", " + unitNumber + ", " + weight + ", " + ppu + ", " + entryDate + ", " + expiryDate;
    }
}
