import java.util.Scanner;

public class Calculator {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Change the Color of text and Bold the text.
        System.out.print(ANSI_BOLD + ANSI_GREEN + "\n\n\t>>>>>> Easy Calculator <<<<<<<");

        int exit;

        do {
            // Get the Input from the User...
            Scanner input = new Scanner(System.in);

            System.out.print(ANSI_YELLOW + "\n\n( +   -   *   / )" + ANSI_YELLOW);
            System.out.print(ANSI_GREEN + "\n\nEnter the Operator: ");
            char operator = input.next().charAt(0);

            if (operator == '0') {
                // Exit the calculator
                System.out.println("\nExiting the Calculator. Goodbye!");
                break;
            }

            System.out.print(ANSI_GREEN + "\nEnter the First Number : ");
            double number1 = input.nextDouble();

            System.out.print(ANSI_GREEN + "\nEnter the Second Number: ");
            double number2 = input.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println("\n" + number1 + " + " + number2 + " = " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("\n" + number1 + " - " + number2 + " = " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("\n" + number1 + " * " + number2 + " = " + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                        System.out.println("\n" + number1 + " / " + number2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }

            // Ask if the user wants to continue or exit
            System.out.print(ANSI_YELLOW + "\n\nYou want to Exit? Enter -1, or Enter 0 to Continue: ");
            exit = input.nextInt();

        } while (exit != -1);

        System.out.println(ANSI_RESET + "\nExiting the Calculator. Goodbye!");
    }
}
