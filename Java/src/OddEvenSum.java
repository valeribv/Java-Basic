import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityOfNumbers = Integer.parseInt(scanner.nextLine());

        //Variables for construction
        int sumEvenLeft = 0;
        int sumEvenRight = 0;
        int sumOddLeft = 0;
        int sumOddRight = 0;

        int leftSide = 0;
        int rightSide = 0;

        //input for quantity of numbers
        for (int index = 1; index <= quantityOfNumbers; index++) {

            int inputNumber = Integer.parseInt(scanner.nextLine());

            if (index % 2 == 0) {
                leftSide = inputNumber;
                // count odd or even for LEFT side
                if (leftSide % 2 != 0) {
                    sumEvenLeft += leftSide;
                } else {
                    sumOddLeft += leftSide;
                }

            } else {
                rightSide = inputNumber;
                // count odd or even for RIGHT side
                if (rightSide % 2 != 0) {
                    sumEvenRight += rightSide;
                } else {
                    sumOddRight += rightSide;
                }

            }
            //Print
            if (index == quantityOfNumbers) {

                if (sumOddRight == sumOddLeft) {
                    System.out.printf("Yes%nSum = %d%n", sumOddRight);
                } else {
                    System.out.printf("No%nDiff = %d", Math.abs((sumEvenRight + sumOddRight) - (sumEvenLeft + sumOddLeft)));
                }
            }
        }
    }
}