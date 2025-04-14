import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int numberLeftOne = Integer.parseInt(scanner.nextLine());
        int numberLeftTwo = Integer.parseInt(scanner.nextLine());

        int numberRightOne = Integer.parseInt(scanner.nextLine());
        int numberRightTwo = Integer.parseInt(scanner.nextLine());

        int leftSide = numberLeftOne + numberLeftTwo;
        int rightSide = numberRightOne + numberRightTwo;
        int sum = leftSide + rightSide;


        if (leftSide == rightSide) {
            System.out.println("Yes, sum = 100");
        } else if (leftSide > rightSide) {
            System.out.printf("No, diff = %d", Math.abs(leftSide - rightSide));
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSide - rightSide));
        }
    }
}
