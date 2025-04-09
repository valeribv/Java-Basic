import java.util.Scanner;
public class InvalidNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberInRange = Double.parseDouble(scanner.nextLine());

        if (numberInRange >= 100 && numberInRange <= 200 || numberInRange == 0) {
            System.out.println("");
        } else {
            System.out.println("invalid");
        }
    }
}