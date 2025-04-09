import java.util.Scanner;

public class TradeCommissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        if (price >= 0 && price <= 500) {
            switch (town) {
                case "Sofia":
                    System.out.printf("%.2f", price * 0.05);
                    break;
                case "Varna":
                    System.out.printf("%.2f", price * 0.045);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", price * 0.055);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (price >= 500 && price <= 1000) {
            switch (town) {
                case "Sofia":
                    System.out.printf("%.2f", price * 0.07);
                    break;
                case "Varna":
                    System.out.printf("%.2f", price * 0.075);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", price * 0.08);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (price >= 1000 && price <= 10000) {
            switch (town) {
                case "Sofia":
                    System.out.printf("%.2f", price * 0.08);
                    break;
                case "Varna":
                    System.out.printf("%.2f", price * 0.1);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", price * 0.12);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (price > 10000) {
            switch (town) {
                case "Sofia":
                    System.out.printf("%.2f", price * 0.12);
                    break;
                case "Varna":
                    System.out.printf("%.2f", price * 0.13);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", price * 0.145);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}