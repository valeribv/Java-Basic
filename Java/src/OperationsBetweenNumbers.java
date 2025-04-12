import java.util.Scanner;

public class OperationsBetweenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double numberOne = Double.parseDouble(scanner.nextLine());
        double numberTwo = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;

        // +
        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%.0f + %.0f = %.0f - even", numberOne, numberTwo, result);
                } else {
                    System.out.printf("%.0f + %.0f = %.0f - odd", numberOne, numberTwo, result);
                }
                break;
            case "-":
                result = numberOne - numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%.0f - %.0f = %.0f - even", numberOne, numberTwo, result);
                } else {
                    System.out.printf("%.0f - %.0f = %.0f - odd", numberOne, numberTwo, result);
                }
                break;
            case "*":
                result = numberOne * numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%.0f * %.0f = %.0f - even", numberOne, numberTwo, result);
                } else {
                    System.out.printf("%.0f * %.0f = %.0f - odd", numberOne, numberTwo, result);
                }
                break;
            case "%":
                result = numberOne % numberTwo;
                if (numberTwo == 0) {
                    System.out.printf("Cannot divide %.0f by zero", numberOne);
                } else {
                    System.out.printf("%.0f %% %.0f = %.0f", numberOne, numberTwo, result);
                }
                break;
            case "/":
                result = numberOne / numberTwo;
                if (numberTwo == 0) {
                    System.out.printf("Cannot divide %.0f by zero", numberOne);
                } else {
                    System.out.printf("%.0f / %.0f = %.2f", numberOne, numberTwo, result);
                }
                break;
        }
    }
}