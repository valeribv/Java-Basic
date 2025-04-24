import java.util.Scanner;

public class SumNumbersWhile {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < maxNumber) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }
        System.out.println(sum);
    }
}
