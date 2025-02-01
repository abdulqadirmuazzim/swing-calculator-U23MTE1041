import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to my console based Calculator");
        System.out.println("-------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter First value: ");
        double num1 = input(scanner);
        System.out.print("enter operation (+, -, *, /, ^): ");
        String operation = scanner.next();
        System.out.print("enter second value: ");
        double num2 = input(scanner);

        switch (operation) {
            case "+" : 
                double sum = Addition(num1, num2);
                System.out.println("sum: " + sum);
                break;
            case "-":
                double difference = num1 - num2;
                System.out.println("Difference: " + difference);
                break;
            case "*":
                double product = num1 * num2;
                System.out.println("Product: " + product);
                break;
            case "/":
                double quotient = num1 / num2;
                System.out.println("Quotient: " + quotient);
                break;
            case "^":
                double power = Math.pow(num1, num2);
                System.out.println("Power: " + power);
                break;

            default:
                System.out.print("Not choosing an operation will result in addition by default: ");
                System.out.println(num1 + num2);
        }

    }

    private static double input(Scanner number){
        double value;
        while (true) {
            if (number.hasNextDouble()) { // check if the input is a double
                value = number.nextDouble();
                break;
            }else{
                System.out.print("Invalid input, enter a number: ");
                number.next();
            }
        }
        return value;
    }
    // Addition
    private static double Addition(double num1, double num2){
        return num1 + num2;
    }
}
