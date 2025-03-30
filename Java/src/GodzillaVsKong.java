import java.util.Scanner;
public class GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budgetForMovie = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceCloutsPerPerson = Double.parseDouble(scanner.nextLine());

        double movieDecor = budgetForMovie * 0.1;
        double priceforAllCloutes = people * priceCloutsPerPerson;

        if (people > 150) {
            priceforAllCloutes = priceforAllCloutes - (0.1 * priceforAllCloutes);
        }
        double totalAmount = movieDecor + priceforAllCloutes;
        if (budgetForMovie >= totalAmount) {

            double neededMoney = budgetForMovie - totalAmount;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", neededMoney);
        } else {
            double neededMoney = totalAmount - budgetForMovie;
            System.out.printf("Not enough money!" + "Wingard needs %.2f leva more.", neededMoney);
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        }
    }
}
