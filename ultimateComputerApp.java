import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ultimateComputerMenu {
    static Scanner userinput = new Scanner(System.in);

    static int factorial(int num) {
        int total = 1;

        if (num % 2 == 0) {
            for (int i = 0; i < num + 1; i++) {
                if (i % 2 == 0 && i > 0) {
                    total = total * i;
                }
            }
        }
        if (num % 2 != 0) {
            for (int i = 0; i < num + 1; i++) {
                if (i % 2 != 0) {
                    total = total * i;

                }
            }
        }

        return total;

    }

    static String factorialDouble() {

        int userNum;
        int userFactorial;
        String output;

        System.out.println("Please select a number less than 20");
        userNum = userinput.nextInt();

        while (userNum > 20) {
            System.out.println("Please enter a number less than 20");
            userNum = userinput.nextInt();
        }

        userFactorial = factorial(userNum);

        output = "The double factorial of " + userNum + " is equal to " + userFactorial;
        return output;
    }

    static int[] fibbonacciSequence() {

        int[] numbers = {1, 1};
        int length;

        System.out.println("How many fibonacci numbers would you like?");
        length = userinput.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print(Arrays.toString(numbers) + " ");
            numbers[0] = numbers[1] + numbers[0];
            numbers[1] = numbers[1] + numbers[0];
        }

        return numbers;
    }

    static int average(ArrayList list) {

        int listAverage;
        int loc = 0;
        int listTotal = 0;

        for (int j = 0; j < list.size(); j++) {
            listTotal = listTotal + (int) list.get(loc);

            loc++;
        }

        listAverage = listTotal / list.size();

        return listAverage;
    }

    static String listAverage() {
        ArrayList<Integer> list = new ArrayList<>();

        int listLength;

        System.out.println("How many numbers do you want to add to the list? 1-30");
        listLength = userinput.nextInt();

        for (int i = 0; i < listLength; i++) {
            System.out.println("what number would you like to add");
            list.add(userinput.nextInt());
        }

        System.out.println("The average of your numbers is " + average(list));
        return "";
    }

    static String dice() {
        String play;
        Random rand = new Random();
        int dice1;
        int dice2 = 0;
        int dice_total;

        System.out.println("Would you like to roll dice?");
        play = userinput.nextLine();
        play = userinput.nextLine();
        play = play.toLowerCase();

        while (play.equals("yes")) {

            dice1 = rand.nextInt(1, 6);
            dice2 = rand.nextInt(1, 6);
            dice_total = dice1 + dice2;
            System.out.println("Dice 1 =" + dice1 + " " + "Dice 2 =" + dice2
                    + " " + "The total of the dice =" + dice_total);

            System.out.println("Would you like to roll again?");

            play = userinput.nextLine();
            play = play.toLowerCase();
        }
        return "";
    }

    static String piecewise() {

        int input;
        int equation = 0;

        System.out.println("what number would you like to use for the piecewise equations?");
        input = userinput.nextInt();

        if (input < 0) {
            equation = -3 * input + 7;
        }
        if (input >= 0 && input <= 10) {
            equation = (int) Math.pow(input, 2) + 8;
        }
        if (input > 10) {
            equation = (int) Math.pow(input, 3) - 6 * input * input;
        }
        System.out.println(equation);
        return "";
    }

    public static double log(double number, double base) {

        double logged = (int) (Math.log(number) / Math.log(base));
        return logged;
    }

    static String calculator() {
        double number1;
        double number2;
        double addition;
        double multiply;
        double divide;
        double exponent;
        double log;

        System.out.println("Please enter your first number. (Must be positive and greater than 1)");
        number1 = userinput.nextDouble();

        System.out.println("Please enter your second number. (Must be positive and greater than 1)");
        number2 = userinput.nextDouble();

        addition = number1 + number2;

        multiply = number1 * number2;

        divide = number1 / number2;

        exponent = Math.pow(number1, number2);

        log = log(number1, number2);

        System.out.println("When added your numbers =" + ' ' + addition + ' ' + "When multiplied they =" + ' ' + multiply +
                ' ' + "When divided they =" + ' ' + divide + ' ' + "When number 1 is raised to the power of number 2 it =" + ' ' +
                exponent + ' ' + "And when logged it =" + ' ' + log);

        return "";
    }

    static String saying() {
        System.out.format("%60s", "\tLoyalty is its own reward\n");
        return "";
    }

    static String art() {
        System.out.println("            ###############            ");
        System.out.println("         #####################         ");
        System.out.println("      ###########################      ");
        System.out.println("    ##############################     ");
        System.out.println("  #################################    ");
        System.out.println("####################################   ");
        System.out.println("#######      ###########       ######  ");
        System.out.println("#######  ##  ###########  ###  ########");
        System.out.println("#######      ###########       ########");
        System.out.println("#######################################");
        System.out.println("#######################################");
        System.out.println("#######################################");
        System.out.println("#######################################");
        System.out.println("##########                   ##########");
        System.out.println("###########                 ###########");
        System.out.println("##############            #############");
        System.out.println(" ####################################  ");
        System.out.println("  #################################    ");
        System.out.println("     ############################      ");
        System.out.println("#######################################");
        System.out.println("#######################################");

        return "";
    }

    static String encouragement() {
        String firstName;
        String middleName;
        String lastName;


        System.out.println("What is your first name?");
        firstName = userinput.nextLine();
        firstName = userinput.nextLine();

        System.out.println("What is your middle name?");
        middleName = userinput.nextLine();

        System.out.println("What is your last name?");
        lastName = userinput.nextLine();

        System.out.printf("Good job" + ' ' + firstName + ' ' + middleName + ' ' + lastName + ' ' + "\uD83D\uDE38");
        return "";
    }

    public static void main(String[] args) {
        int menuSelect;

        String loopValue;

        System.out.println("Would you like to use the computer? Yes or No");

        loopValue = userinput.nextLine().toLowerCase();

        while (loopValue.equals("yes")) {
            System.out.println("Here is a list of methods to choose from");
            System.out.println("Method list: 1 = Double Factorial, 2 = Fibonacci Sequence, 3 = Average of a list,");
            System.out.println("4 = Dice Game, 5 = Piecewise Function, 6 = Calculator App, 7 = Favorite Saying,");
            System.out.println("8 = ASCII Art, 9 = Encouragement App.");

            System.out.println("What method would you like to call: choose a number 1-9.");
            menuSelect = userinput.nextInt();

            while (menuSelect < 1 || menuSelect > 9) {
                System.out.println("Please select a number between 1 and 9");
            }

            if (menuSelect == 1) {
                System.out.println(factorialDouble());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
                loopValue = userinput.nextLine().toLowerCase();
            }
            if (menuSelect == 2) {
                System.out.println(fibbonacciSequence());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
                loopValue = userinput.nextLine().toLowerCase();
            }
            if (menuSelect == 3) {
                System.out.println(listAverage());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
                loopValue = userinput.nextLine().toLowerCase();

            }
            if (menuSelect == 4) {
                System.out.println(dice());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();

            }
            if (menuSelect == 5) {
                System.out.println(piecewise());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
                loopValue = userinput.nextLine().toLowerCase();
            }
            if (menuSelect == 6) {
                System.out.println(calculator());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
                loopValue = userinput.nextLine().toLowerCase();
            }
            if (menuSelect == 7) {
                System.out.println(saying());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
                loopValue = userinput.nextLine().toLowerCase();
            }
            if (menuSelect == 8) {
                System.out.println(art());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
                loopValue = userinput.nextLine().toLowerCase();
            }
            if (menuSelect == 9) {
                System.out.println(encouragement());
                System.out.println("Would you like to use another app? Yes or No");
                loopValue = userinput.nextLine().toLowerCase();
            }
        }
    }
}



