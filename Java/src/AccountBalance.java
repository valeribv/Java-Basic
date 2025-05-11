import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sumMoney = 0;

        while (!command.equals("NoMoreMoney")) {

            if (Double.parseDouble(command) < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f\n", Double.parseDouble(command));
                sumMoney += Double.parseDouble(command);
                command = scanner.nextLine();
            }
        }
        System.out.printf("Total: %.2f\n", sumMoney);
    }
}
