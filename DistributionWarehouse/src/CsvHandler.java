import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class CsvHandler {

    public CsvHandler(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            createCsvFile(fileName);
        }
    }

    public void createCsvFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(String.join(",", "Name, Unit, Weight, PPU, EntryDate, ExpiryDate, Nutritional Quality, Producer"));
        } catch (IOException e) {
            System.out.println("An error occurred while creating the CSV file: " + e.getMessage());
        }
    }

    public void savePackToCsv(String fileName, SimpleProduct product) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            System.out.println(product.toCvs());
            writer.println(product.toCvs());
        } catch (IOException e) {
            System.out.println("Failed to update CSV file: " + e.getMessage());
        }
    }

    public void readWarehouseLogCsv(String fileName, LocalDate currentDate) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] details = line.split(",");
                for(String detail: details) {
                    System.out.println(detail);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("CSV file not found: " + e.getMessage());
        }

    }


}
