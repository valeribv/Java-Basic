import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int quantityOfNumbers = Integer.parseInt(scanner.nextLine());

        int sumEvenLeft = 0;
        int sumEvenRight = 0;
        int sumOddLeft = 0;
        int sumOddRight = 0;

        int leftSide = 0;
        int rightSide = 0;

        int evenLeft = 0;
        int oddLeft = 0;

        int evenRight = 0;
        int oddRight = 0;

        for (int index = 1; index <= quantityOfNumbers; index++) {

            int inputNumber = Integer.parseInt(scanner.nextLine());

            if (index % 2 == 0) {

                leftSide = inputNumber;
                //     четно / нечетно
                // count odd or even for LEFT side
                if (leftSide % 2 != 0) {
                    evenLeft = leftSide;
                    sumEvenLeft += evenLeft;
                } else {
                    oddLeft = leftSide;
                    sumOddLeft += oddLeft;
                }

            } else {

                rightSide = inputNumber;
                //     четно / нечетно
                // count odd or even for RIGHT side
                if (rightSide % 2 != 0) {
                    evenRight = rightSide;
                    sumEvenRight += evenRight;
                } else {
                    oddRight = rightSide;
                    sumOddRight += oddRight;
                }

            }
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