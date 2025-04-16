import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityOfNumbers = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int index = 1; index <= quantityOfNumbers; index++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            sumLeft += inputNumber;
        }
        for (int j = 1; j <= quantityOfNumbers; j++) {
            int rightNumber = Integer.parseInt(scanner.nextLine());
            sumRight += rightNumber;
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = " + sumLeft);
        } else {
            int diff = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = " + diff);
        }
    }
}