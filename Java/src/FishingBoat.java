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
                if (peopleCount <= 6 && peopleCount % 2 == 0) {
                    priceShip = (priceShip * 0.9) * 0.05;
                } else if (peopleCount >= 7 && peopleCount <= 11 && peopleCount % 2 == 0) {
                    priceShip = (priceShip * 0.85) * 0.05;
                } else if (peopleCount > 12 && peopleCount % 2 == 0) {
                    priceShip = (priceShip * 0.85) * 0.05;
                } else if (peopleCount <= 6) {
                    priceShip = (priceShip * 0.9);
                } else if (peopleCount >= 7 && peopleCount <= 11) {
                    priceShip = (priceShip * 0.85);
                } else if (peopleCount > 12) {
                    priceShip = (priceShip * 0.85);
                    break;
                }
            case "Summer":
            case "Autumn":
                priceShip = 4200;
                if (peopleCount <= 6 && peopleCount % 2 == 0 && !season.equals("Autumn")) {
                    priceShip = (priceShip * 0.9) * 0.05;
                } else if (peopleCount >= 7 && peopleCount <= 11 && peopleCount % 2 == 0 && !season.equals("Autumn")) {
                    priceShip = (priceShip * 0.85) * 0.05;
                } else if (peopleCount > 12 && peopleCount % 2 == 0 && !season.equals("Autumn")) {
                    priceShip = (priceShip * 0.85) * 0.05;
                } else if (peopleCount <= 6) {
                    priceShip = (priceShip * 0.9);
                } else if (peopleCount >= 7 && peopleCount <= 11) {
                    priceShip = (priceShip * 0.85);
                } else if (peopleCount > 12) {
                    priceShip = (priceShip * 0.85);
                    break;
                }
            case "Winter":
                priceShip = 2600;
                if (peopleCount <= 6 && peopleCount % 2 == 0) {
                    priceShip = (priceShip * 0.9) * 0.05;
                } else if (peopleCount >= 7 && peopleCount <= 11 && peopleCount % 2 == 0) {
                    priceShip = (priceShip * 0.85) * 0.05;
                } else if (peopleCount > 12 && peopleCount % 2 == 0) {
                    priceShip = (priceShip * 0.85) * 0.05;
                } else if (peopleCount <= 6) {
                    priceShip = (priceShip * 0.9);
                } else if (peopleCount >= 7 && peopleCount <= 11) {
                    priceShip = (priceShip * 0.85);
                } else if (peopleCount > 12) {
                    priceShip = (priceShip * 0.85);
                    break;
                }
        }
        if (budgedPeople < priceShip) {
            double neededMoney = Math.abs(priceShip - budgedPeople);
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        } else {
            double neededMoney = Math.abs(priceShip - budgedPeople);
            System.out.printf("Yes! You have %.2f leva left.", neededMoney);
        }
    }
}