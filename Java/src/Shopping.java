import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsQuantity = Integer.parseInt(scanner.nextLine());
        int cpuQuantity = Integer.parseInt(scanner.nextLine());
        int ramQuantity = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = 250 * videoCardsQuantity;
        double cpuPrice = (videoCardsPrice * 0.35) * cpuQuantity;
        double ramPrice = (videoCardsPrice * 0.1) * ramQuantity;

        double totalAmount = videoCardsPrice + cpuPrice + ramPrice;

        if (videoCardsQuantity > cpuQuantity) {
            totalAmount = totalAmount * 0.85;
        }

        if (budget >= totalAmount) {
            double neededPrice = budget - totalAmount;
            System.out.printf("You have %.2f leva left!", neededPrice);
        } else {
            double neededPrice = totalAmount - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", neededPrice);
        }
    }
}
