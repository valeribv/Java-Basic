import java.util.Scanner;
import java.util.regex.Matcher;

public class HalfSumElement {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = 0;
        int maxNumber = Integer.MIN_VALUE;
        int currentNumber = 0;
        int diff = 0;

        for (int index = 0; index < inputNumber; index++) {

            currentNumber = Integer.parseInt(scanner.nextLine());
            sumOfNumbers += currentNumber;
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        diff = sumOfNumbers - maxNumber;
        if (maxNumber == diff) {
            System.out.printf("Yes%n Sum = %d", maxNumber);
        } else {
            System.out.printf("No %n Diff = %d", Math.abs(maxNumber - diff));
        }
    }
}
