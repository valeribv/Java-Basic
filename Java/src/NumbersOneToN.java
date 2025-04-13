import java.util.Scanner;

public class NumbersOneToN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int index = number; index >= 1; index-- ){
            System.out.println(index);
        }
    }
}