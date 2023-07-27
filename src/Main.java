public class Main {

    // 1.1.Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static void greeting() {
        System.out.println("Hello\nEric");
    }

    // 1.2. Printati rezultatul sumei a doua numere(orice numere)
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    // 1.3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    // 2.2 Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    // 1.4. Printati rezultatul urmatoarelor operatiuni:
    public static void operationResults() {
        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);

        // b. (55+9) % 9
        System.out.println((55 + 9) % 9);

        // c. 20 + -3*5 / 8
        System.out.println((20 + (double) -3 * 5 / 8));

        // d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println((5 + 15 / 3 * 2 - 8 % 3));
    }

    /* 2.3.Scrieti o metoda java, care sa afiseze urmatorul model:

                     +"""""+
                    [| o o |]
                     |  ^  |
                     | '-' |
                     +-----+
     */
    public static void displayFrankenstein() {
        System.out.println("""
                 +""\"""+                                                \s
                [| o o |]                                               \s
                 |  ^  |                                                \s
                 | '-' |                                                \s
                 +-----+\s""".indent(20));
    }

    // 2.4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public static double average(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }

    // 2.5.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public static double remainder(double number1, double number2) {
        return number1 % number2;
    }

    // 2.6.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
    public static double conversionToCelsius(double fahrenheit) {
        return (double) 5 / 9 * (fahrenheit - 32);
    }

    // 2.7.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii
    public static double conversionToMeters(double inch) {
        return inch * 0.0254;
    }

    // 2.8.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
    public static void conversionToSpeed(double distance, int hours, int minutes, int seconds) {
        System.out.println("Speed: " + distance / (hours * 3600 + minutes * 60 + seconds) + " m/s");
        System.out.println("       " + (distance / 1000) / (hours + (double) minutes / 60 + (double) seconds / 3600) + " km/h");
        System.out.println("       " + (distance / 1609) / (hours + (double) minutes / 60 + (double) seconds / 3600) + " miles/h");
    }

    // 2.9.Scrieti un program care primeste ca input raza unui cerc si printeaza perimetrul si aria acelui cerc
    public static void circle(double radius) {
        System.out.println("Area of circle: " + Math.PI * radius * radius);
        System.out.println("Perimeter of circle: " + 2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        greeting();

        System.out.println("Addition: " + add(3.14, 4));

        System.out.println("Division: " + divide(10, 3));

        System.out.println("Subtraction: " + subtract(3.14, 4));

        System.out.println("Multiplication: " + multiply(10, 3));

        System.out.println("Operation results: ");
        operationResults();

        displayFrankenstein();

        System.out.println("Average: " + average(1, 2, 3));

        System.out.println("Remainder: " + remainder(4, 2));

        System.out.println("Converted to celsius: " + conversionToCelsius(100) + "C");

        System.out.println("Converted to meters: " + conversionToMeters(1));

        conversionToSpeed(1500, 1, 0, 0);

        circle(2.3);
    }


}
