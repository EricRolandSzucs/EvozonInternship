public class Main {

    // 1.Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static void greeting() {
        System.out.println("Hello\nEric");
    }

    // 2. Printati rezultatul sumei a doua numere(orice numere)
    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    // 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    // 4. Printati rezultatul urmatoarelor operatiuni:
    public static void operation_results() {
        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);

        // b. (55+9) % 9
        System.out.println((55 + 9) % 9);

        // c. 20 + -3*5 / 8
        System.out.println((20 + (double) -3 * 5 / 8));

        // d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println((5 + 15 / 3 * 2 - 8 % 3));
    }

    public static void main(String[] args) {
        greeting();

        System.out.println(sum(3.14, 4));
        
        System.out.println(divide(10, 3));

        operation_results();
    }


}
