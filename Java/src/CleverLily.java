import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double money = 10;
        double toyTotalPrice = 0;
        double totalPrice = 0;
        int quantityToys = 0;
        double brother = 0;

        for (int index = 1; index <= age; index++) {

            if (index % 2 == 0) {
                totalPrice += money;
                money += 10;
                brother++;
            } else {
                quantityToys++;
            }
        }
        toyTotalPrice = quantityToys * toyPrice;
        totalPrice = (totalPrice + toyTotalPrice) - brother;

        if (totalPrice >= washingMachine) {
            System.out.printf("Yes! %.2f", (totalPrice - washingMachine));
        } else {
            System.out.printf("No! %.2f", washingMachine - totalPrice);
        }
    }
}