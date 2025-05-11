import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int inputNumber = 0;
        int number = Integer.MIN_VALUE;
        int maxNumber = 0;

        while (!command.equals("Stop")) {
            inputNumber = Integer.parseInt((command));

            if (inputNumber < maxNumber) {
                maxNumber = inputNumber;
            }
            command = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}