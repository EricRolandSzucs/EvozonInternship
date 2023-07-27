public class Calculator {
    public static void main(String[] args) {

    }

    // 1.2. Printati rezultatul sumei a doua numere(orice numere)
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    // 1.3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    // 2.2 Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    // 2.4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public double average(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }

    // 2.5.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public double remainder(double number1, double number2) {
        return number1 % number2;
    }

}
