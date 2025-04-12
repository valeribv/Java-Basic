import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgedPeople = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double peopleCount = Double.parseDouble(scanner.nextLine());

        double priceShip = 0;

        switch (season) {
            case "Spring":
                priceShip = 3000;
                break;
            case "Summer":
                priceShip = 4200;
                break;
            case "Autumn":
                priceShip = 4200;

                break;
            case "Winter":
                priceShip = 2600;
                break;
        }
        if (peopleCount <= 6) {
            priceShip *= 0.9;
        } else if (peopleCount >= 7 && peopleCount <= 11) {
            priceShip *= 0.85;

        } else if (peopleCount > 12) {
            priceShip *= 0.75;
        }
        if (peopleCount % 2 == 0 && !season.equals("Autumn")) {
            priceShip *= 0.95;
        }

        double leftMoney = Math.abs(budgedPeople - priceShip);

        if (priceShip > budgedPeople) {
            System.out.printf("Not enough money! You need %.2f leva.", leftMoney);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        }
    }
}