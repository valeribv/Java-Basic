import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //scanner
        String typeOfFlowers = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        //Data and price
        double Roses = 5;
        double Dahlias = 3.8;
        double Tulips = 2.8;
        double Narcissus = 3;
        double Gladiolus = 2.5;

        double currentBudgetPrice = 0;

        //Problem solving

        //Roses
        if (typeOfFlowers.equals("Roses")) {
            if (quantity > 80) {
                currentBudgetPrice = (Roses * quantity) * 0.9;
            } else {
                currentBudgetPrice = Roses * quantity;
            }
            if (currentBudgetPrice > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (currentBudgetPrice - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %f %s and %.2f leva left.", quantity,
                        typeOfFlowers,
                        Math.abs(budget - currentBudgetPrice));
            }

            //Dahlias
        } else if (typeOfFlowers.equals("Dahlias")) {
            if (quantity > 90) {
                currentBudgetPrice = (Dahlias * quantity) * .85;
            } else {
                currentBudgetPrice = Dahlias * quantity;
            }
            if (currentBudgetPrice > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (currentBudgetPrice - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", quantity,
                        typeOfFlowers,
                        Math.abs(budget - currentBudgetPrice));
            }

            //Tulips
        } else if (typeOfFlowers.equals("Tulips")) {
            if (quantity > 80) {
                currentBudgetPrice = (Tulips * quantity) * .85;
            } else {
                currentBudgetPrice = Tulips * quantity;
            }
            if (currentBudgetPrice > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (currentBudgetPrice - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", quantity,
                        typeOfFlowers,
                        Math.abs(budget - currentBudgetPrice));
            }

            //Narcissus
        } else if (typeOfFlowers.equals("Narcissus")) {
            if (quantity < 120) {
                currentBudgetPrice = (Narcissus * quantity) * 1.15;
            } else {
                currentBudgetPrice = Narcissus * quantity;
            }
            if (currentBudgetPrice > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (currentBudgetPrice - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", quantity,
                        typeOfFlowers,
                        Math.abs(budget - currentBudgetPrice));
            }

        } else if (typeOfFlowers.equals("Gladiolus")) {
            if (quantity < 80) {
                currentBudgetPrice = (Gladiolus * quantity) * 1.2;
            } else {
                currentBudgetPrice = Gladiolus * quantity;
            }
            if (currentBudgetPrice > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (currentBudgetPrice - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", quantity,
                        typeOfFlowers,
                        Math.abs(budget - currentBudgetPrice));
            }
        }
    }
}
