import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int quantityOfNumbers = Integer.parseInt(scanner.nextLine());

        for (int index = 1; index <= quantityOfNumbers; index++) {

            int number = Integer.parseInt(scanner.nextLine());
            counter += number;
        }
        System.out.println(counter);
    }
}