public class Main {

    // 1.1.Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static void greeting() {
        System.out.println("Hello\nEric");
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

        // Calculator operations:
        Calculator c = new Calculator();
        System.out.println("-------------------------------------");
        System.out.println("Addition: " + c.add(3.14, 4));
        System.out.println("-------------------------------------");
        System.out.println("Division: " + c.divide(10, 3));
        System.out.println("-------------------------------------");
        System.out.println("Subtraction: " + c.subtract(3.14, 4));
        System.out.println("-------------------------------------");
        System.out.println("Multiplication: " + c.multiply(10, 3));
        System.out.println("-------------------------------------");
        System.out.println("Operation results: ");

        // Assignment 1+2:
        operationResults();
        System.out.println("-------------------------------------");
        displayFrankenstein();
        System.out.println("-------------------------------------");
        System.out.println("Average: " + c.average(1, 2, 3));
        System.out.println("-------------------------------------");
        System.out.println("Remainder: " + c.remainder(4, 2));
        System.out.println("-------------------------------------");
        System.out.println("Converted to celsius: " + conversionToCelsius(100) + "C");
        System.out.println("-------------------------------------");
        System.out.println("Converted to meters: " + conversionToMeters(1));
        System.out.println("-------------------------------------");
        conversionToSpeed(1500, 1, 0, 0);
        System.out.println("-------------------------------------");
        circle(2.3);

        // Assignment 3 - if-else:

        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(2, 3);

        System.out.println("The bigger number is: " + biggest);
        System.out.println("-------------------------------------");
        System.out.println(op.textEquals("Evozon"));
        System.out.println("-------------------------------------");
        System.out.println(op.textEqualsAndIntLess("NotEvozon", 3));
        System.out.println("-------------------------------------");
        System.out.println(op.intCompare(6));
        System.out.println("-------------------------------------");
        System.out.println(op.numberCompare(3.2));
        System.out.println("-------------------------------------");
        op.numberReceiver(9);
        System.out.println("-------------------------------------");
        System.out.println(op.isNumberEven(2));
        System.out.println("-------------------------------------");
        System.out.println(op.isEligibleToVote(18));
        System.out.println("-------------------------------------");
        System.out.println(op.biggestOfThree(2, 2, 3));
        System.out.println("-------------------------------------");
        // Assignment 4 - for loops

        op.countUpFrom(97);
        System.out.println("-------------------------------------");
        op.countDownFrom(-97);
        System.out.println("-------------------------------------");
        op.countInRange(90, 93);
        System.out.println("-------------------------------------");
        op.countInRangeComparison(93, 90);
        System.out.println("-------------------------------------");
        System.out.println(op.sumNumbers(99));
        System.out.println("-------------------------------------");
        System.out.println(op.averageNumbers(98));
        System.out.println("-------------------------------------");
        op.doDrawing(7);

        // Assignment 5 - while loops

        op.countUpFromWhile(97);
        System.out.println("-------------------------------------");
        op.countDownFromWhile(-97);
        System.out.println("-------------------------------------");
        op.countInRangeWhile(97, 100);
        System.out.println("-------------------------------------");
        op.countInRangeComparisonWhile(100, 97);
        System.out.println("-------------------------------------");
        op.sumAndAverage(111, 8899);
        System.out.println("-------------------------------------");
        op.averageDivisibleBySeven(10, 22);
        System.out.println("-------------------------------------");
        op.CozaLozaWoza();
        System.out.println("-------------------------------------");
        // Assignment 6 - arrays
        System.out.println(c.add(2, 4));
        System.out.println("-------------------------------------");
        System.out.println(c.subtract(3.4, 4.3));
        System.out.println("-------------------------------------");
        System.out.println(c.multiply(1, 2, 3));
        System.out.println("-------------------------------------");
        System.out.println(c.divide(5, 2));
        System.out.println("-------------------------------------");
        System.out.println(c.average(1, 2));
        System.out.println("-------------------------------------");
        System.out.println(c.remainder(4, 3));
        System.out.println("-------------------------------------");

        int[] array = new int[100];

        op.arrayFill(array);
        System.out.println("-------------------------------------");

        int[] array2 = new int[50];

        op.arrayFillEven(array2);
        System.out.println("-------------------------------------");

        for (int i = 0; i < 50; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("-------------------------------------");
        double[] array3 = {3, 4, 7, 3, 2};
        System.out.println(op.averageFromArray(array3));
        System.out.println("-------------------------------------");
        String[] array4 = {"Another", "one", "bites", "the", "dust"};

        if (op.containsString(array4, "dusts")) {
            System.out.println("Array contains string");
        } else
            System.out.println("Array does not contain string");
        System.out.println("-------------------------------------");

        System.out.println("Index of element: " + op.containsInt(array2, 92));
        System.out.println("-------------------------------------");
        char[] character = {'-', ' '};

        op.drawLines(character);
        System.out.println("-------------------------------------");
        System.out.println();
        int[] array7 = op.removeElement(array2, 2);
        for (int i = 0; i < array7.length; i++)
            System.out.println(array7[i]);

        System.out.println("-------------------------------------");
        int[] array5 = {5, 2, 3, 4};
        System.out.println(op.secondSmallest(array5));
        
        System.out.println("-------------------------------------");
        int[] array6 = new int[4];
        op.copyMethod(array5, array6);

        for (int i = 0; i < array6.length; i++) {
            System.out.println(array6[i]);
        }
        System.out.println("-------------------------------------");
    }


}
