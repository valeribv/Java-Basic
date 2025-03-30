//import java.util.Scanner;
//
//public class GodzillaVsKong {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        double budgetForMovie = Double.parseDouble(scanner.nextLine());
//        int people = Integer.parseInt(scanner.nextLine());
//        double priceCloutsPerPerson = Double.parseDouble(scanner.nextLine());
//
//        double movieDecor = budgetForMovie * 0.1;
//        double priceforAllCloutes = people * priceCloutsPerPerson;
//
//        double movieSum = movieDecor + priceforAllCloutes;
//        double neededMoney = Math.abs(budgetForMovie - movieSum);
//
//        if(people > 150){
//            priceforAllCloutes = priceforAllCloutes + 0.9;
//            movieSum = priceforAllCloutes + movieDecor;
//            System.out.println("Action!");
//            System.out.printf("Wingard starts filming with %.2f leva left.", neededMoney);
//        } else {
//            System.out.println("Action!");
//            System.out.printf("Wingard starts filming with %.2f leva left.", neededMoney);
//        }
//
//        System.out.println("Action!");
//        System.out.printf("Wingard starts filming with %.2f leva left.", neededMoney);
//
//
//    }
//}
