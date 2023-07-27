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

}