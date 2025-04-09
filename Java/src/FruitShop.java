import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            switch (product) {
                case "banana":
                    System.out.printf("%.2f", quantity * 2.5);
                    break;
                case "apple":
                    System.out.printf("%.2f", quantity * 1.2);
                    break;
                case "orange":
                    System.out.printf("%.2f", quantity * 0.85);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", quantity * 1.45);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", quantity * 2.7);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", quantity * 5.5);
                    break;
                case "grapes":
                    System.out.printf("%.2f", quantity * 3.85);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            switch (product) {
                case "banana":
                    System.out.printf("%.2f", quantity * 2.7);
                    break;
                case "apple":
                    System.out.printf("%.2f", quantity * 1.25);
                    break;
                case "orange":
                    System.out.printf("%.2f", quantity * 0.9);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", quantity * 1.6);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", quantity * 3);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", quantity * 5.6);
                    break;
                case "grapes":
                    System.out.printf("%.2f", quantity * 4.2);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}