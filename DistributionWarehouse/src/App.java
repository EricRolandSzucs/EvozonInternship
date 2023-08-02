import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class App {

    public static void main(String[] args) {
         String[] fruits = {"Apples", "Peaches", "Oranges"};
         String[] vegetables = {"Potatoes", "Onions"};
         String[] other = {"Crackers"};

         String[] productNames = {"Apples", "Potatoes", "Onions", "Peaches", "Oranges", "Crackers"};
         String[] productUnit = {"Kg", "Bag", "Box", "Pack"};

        CsvHandler csv = new CsvHandler("warehouselog.csv");

        for(int i=0;i<3;i++) {
            Random rand = new Random();
            int randomProduct = rand.nextInt(productNames.length);
            int randomUnit = rand.nextInt(productUnit.length);

            System.out.println(productNames[randomProduct]);

            int randomPackageNumber;
            switch (productUnit[randomUnit]) {
                case "Kg":
                    randomPackageNumber = rand.nextInt(50, 250);
                case "Bag":
                    randomPackageNumber = rand.nextInt(15, 25);
                case "Box":
                    randomPackageNumber = rand.nextInt(30, 60);
                case "Pack":
                    randomPackageNumber = rand.nextInt(100, 500);
            }
            double randomWeightPerUnit = rand.nextDouble(1.0, 10.0);
            double randomPricePerUnit = rand.nextDouble(1.0, 50.0);

            LocalDate startDate = LocalDate.now();
            LocalDate endDate = startDate.plusMonths(6);

            long days = ChronoUnit.DAYS.between(LocalDate.now(), startDate.plusMonths(6));
            LocalDate randomDate = startDate.plusDays(new Random().nextInt((int) days + 1));
            System.out.println(randomDate);

            int randomNutritional = rand.nextInt(1, 100);

            if (Arrays.asList(fruits).contains(productNames[randomProduct])) {
                Fruits product = new Fruits(productNames[randomProduct], productUnit[randomUnit], randomWeightPerUnit, randomPricePerUnit, randomDate, randomDate, randomNutritional);
                csv.savePackToCsv("warehouselog.csv", product);
            } else if (Arrays.asList(vegetables).contains(productNames[randomProduct])) {
                Vegetables product = new Vegetables(productNames[randomProduct], productUnit[randomUnit], randomWeightPerUnit, randomPricePerUnit, randomDate, randomDate, randomNutritional, "Colgate");
                csv.savePackToCsv("warehouselog.csv", product);
            } else {
                SimpleProduct product = new SimpleProduct(productNames[randomProduct], productUnit[randomUnit], randomWeightPerUnit, randomPricePerUnit, randomDate, randomDate);
                csv.savePackToCsv("warehouselog.csv", product);
            }

            csv.readWarehouseLogCsv("warehouselog.csv", LocalDate.now(), fruits, vegetables, other);
        }
    }
}
