public class LogicalOp {
    public int checkBiggerNumber(int number1, int number2) {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }

    public String textEquals(String text) {
        if (text.equals("Evozon"))
            return "Learning text comparison";
        return "Got to try some more";
    }

    public String textEqualsAndIntLess(String text, int number) {
        if (text.equals("Evozon") && number <= 3)
            return "Evozon " + number;
        return number + " " + text;
    }

    public String intCompare(int number) {
        if (number > 8 || number == 6)
            return "The amount of snow this winter was(cm): " + number;
        return "The forecast snow is(cm):" + number;
    }

    public String numberCompare(double number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4 ";
        else if (number == 4)
            return "The number is equal to 4";
        else if (number < 3)
            return "The number is lower than 3";
        return "The number is 3";
    }

    public void numberReceiver(int number) {
        switch (number) {
            case 1 -> System.out.println("The number is: 1!");
            case 2 -> System.out.println("The number is: 2!");
            case 3 -> System.out.println("The number is: 3!");
            case 4 -> System.out.println("The number is: 4!");
            case 5 -> System.out.println("The number is: 5!");
            case 6 -> System.out.println("The number is: 6!");
            case 7 -> System.out.println("The number is: 7!");
            case 8 -> System.out.println("The number is: 8!");
            case 9 -> System.out.println("The number is: 9!");
            default -> System.out.println("The number is: " + number + "!");
        }
    }

    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public int biggestOfThree(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3)
            return number1;
        else if (number2 >= number1 && number2 >= number3)
            return number2;
        return number3;
    }

    // 4.1
    public void countUpFrom(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // 4.2
    public void countDownFrom(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    // 4.3
    public void countInRange(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }
    }

    // 4.4
    public void countInRangeComparison(int number1, int number2) {
        if (number2 < number1) {
            int t = number2;
            number2 = number1;
            number1 = t;
        }
        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }
    }

    //4.5
    public void evenNumbers() {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    //4.6
    public void oddNumbers() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    //4.7
    public int sumNumbers(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;

    }

    //4.8
    public double averageNumbers(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
            count++;
        }
        return (double) sum / count;

    }

    // 4.9
    public void doDrawing(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = i; j < size; j++) {
                System.out.print('*');
            }
        }
    }

    /* 5.1 Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
       Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
       pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
       deoarece metoda afiseaza, nu returneaza.
     */
    public void countUpFromWhile(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    /* 5.2 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
       Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la -100,
       pornind de la numarul primit ca si parametru.
       Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
     */
    public void countDownFromWhile(int number) {
        int i = number;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    /* 5.3 Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
       Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru
       primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al
       doilea, numaratoarea sa se faca de la x, la y. */
    public void countInRangeWhile(int number1, int number2) {
        int i = number1;
        while (i <= number2) {
            System.out.println(i);
            i++;
        }
    }

    /* 5.4 Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
       Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
       si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
       (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x
       este mai mare decat y,  atunci numaratoarea sa fie de la y la x). */
    public void countInRangeComparisonWhile(int number1, int number2) {
        if (number2 < number1) {
            int t = number2;
            number2 = number1;
            number1 = t;
        }
        int i = number1;
        while (i <= number2) {
            System.out.println(i);
            i++;
        }
    }

    //5.5 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void evenNumbersWhile() {
        int i = 2;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }

    //5.6 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void oddNumbersWhile() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }

    /* 5.7 Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
       Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
       Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
       Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */
    public void sumAndAverage(int number1, int number2) {
        int i = number1;
        int sum = 0;
        int count = 0;
        while (i <= number2) {
            sum = sum + i;
            count++;
            i++;
        }
        System.out.println("Suma totala: " + sum);
        System.out.println("Media numerelor: " + (double) sum / count);

    }

    /* 5.8 Creati o metoda care sa primeasca doi parametrii de tip numar,
      si sa returneze media numerelor divizibile cu 7, din acel interval.
      Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */
    public void averageDivisibleBySeven(int number1, int number2) {
        int i = number1;
        int sum = 0;
        int count = 0;
        while (i <= number2) {
            if (i % 7 == 0) {
                sum = sum + i;
                count++;
            }
            i++;
        }
        System.out.println("Media numerelor: " + (double) sum / count);
    }

    //5.9 Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void fibonacci() {
        int i = 0;
        int j = 1;
        int k;
        int count = 0;
        while (count < 20) {
            System.out.println(i);
            k = j;
            j = i + j;
            i = k;
            count++;
        }
    }

    /* 5.10 Creati o metoda numita CozaLozaWoza.
    Metoda va afisa:
    - numerele de la 1 la 110
    - 11 numere pe linie
    - se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
    - se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
    - se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
    - se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
    - se va afisa CozaWoza pentru multiplu de 3 SI 7
    - se va afisa WozaLoza pentru multiplu de 5 SI 7
    - se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
     */
    public void CozaLozaWoza() {
        int i = 1;
        while (i < 110) {
            boolean word = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                word = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                word = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                word = true;
            }
            System.out.print(" ");
            if (!word)
                System.out.print(i + " ");
            if (i % 11 == 0)
                System.out.println();
            i++;
        }

    }

    /* 6.2 In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
       valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul. */

    public void arrayFill(int[] array) {
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            System.out.println(i + 1);
        }
    }

    /* 6.3 Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
     si sa il returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main()
      pentru a verifica daca functioneaza. Atentie, metoda returneaza un array, deci acesta va
      trebui surprins si afisat folosind o bucla.
     */
    public void arrayFillEven(int[] array) {
        for (int i = 0; i < 100; i = i + 2) {
            array[i / 2] = i;
        }
    }

    /* 6.4  Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat
       cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
       Apelati metoda in main() pentru a verifica daca functioneaza.
     */
    public double averageFromArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    /* 6.5 Creati o metoda care sa primeasca un parametru de tip array de string-uri,
     populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului
      primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu,
      sa returneze false.  Apelati metoda in main() pentru a verifica daca functioneaza.
     */
    public boolean containsString(String[] strings, String word) {
        for (String string : strings) {
            if (string.equals(word)) {
                return true;
            }
        }
        return false;
    }

    /* 6.6. Creati o metoda care sa primeasca un parametru de tip array de numere,
       populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul primit
       se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
       Apelati metoda in main() pentru a verifica daca functioneaza.
     */
    public int containsInt(int[] numbers, int goal) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == goal)
                return i;
        }
        return -1;
    }

    /* 6.7 Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

            - - - - - - - - - -

*/
    public void drawLines(char[] characters) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(characters[0]);
            System.out.println();
            for (int j = 0; j < 10; j++)
                System.out.print(characters[1]);
            System.out.println();
        }
    }

    /* 6.8 Creati o metoda care sa primeasca un parametru de tip array de numere,
       populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul
       exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
     */
    public int[] removeElement(int[] array, int number) {
        int[] array2 = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != number) {
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
    }

    /* 6.9 Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic
    numar din array. Apelati metoda in main() pentru a verifica daca functioneaza.
     */
    public int secondSmallest(int[] numbers) {

        int min1, min2;
        if (numbers[0] < numbers[1]) {
            min1 = numbers[0];
            min2 = numbers[1];
        } else {
            min2 = numbers[0];
            min1 = numbers[1];
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < min1) {
                min2 = min1;
                min1 = numbers[i];
            } else if (numbers[i] < min2) {
                min2 = numbers[i];
            }
        }
        return min2;
    }

    /* 6.10 Creati o metoda care sa primeasca doi parametrii: un array populat cu valori,
       si un array gol. Metoda sa copieze toate valorile din primul array, parcurgandu-l,
       in cel de-al doilea. Apelati metoda in main() pentru a verifica daca functioneaza.
     */
    public void copyMethod(int[] fullArray, int[] emptyArray) {
        for (int i = 0; i < fullArray.length; i++) {
            emptyArray[i] = fullArray[i];
        }
    }
}
