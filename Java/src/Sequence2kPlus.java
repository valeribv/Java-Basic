import java.util.Scanner;

public class Sequence2kPlus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        int numberSum = 1;

        while (numberSum <= inputNumber) {
            System.out.println(numberSum);
            numberSum = numberSum *2 +1;
        }
    }
}
