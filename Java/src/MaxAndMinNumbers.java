import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int number = scanner.nextInt();
        int max = number;
        int min = number;

        for (int i = 1; i < n; i++) {
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}