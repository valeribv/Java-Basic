import java.util.Scanner;

public class SkiTrip {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String feedback = scanner.nextLine();

        double roomForOnPerson = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;

        double totalRoomForOnPerson = roomForOnPerson * (days - 1);
        double totalApartment = apartment * (days - 1);
        double totalPresidentApartment = presidentApartment * (days - 1);

        switch (type) {
            case "room for one person":
                if (feedback.equals("positive")) {
                    System.out.printf("%.2f", totalRoomForOnPerson * 1.25);
                } else {
                    System.out.printf("%.2f", totalRoomForOnPerson * 0.9);
                }
                break;

            case "apartment":
                if (days <= 10) {
                    totalApartment *= 0.7;
                } else if (days > 10 && days <= 15) {
                    totalApartment *= 0.65;
                } else {
                    totalApartment *= 0.5;
                }
                if (feedback.equals("positive")) {
                    System.out.printf("%.2f", totalApartment * 1.25);
                } else {
                    System.out.printf("%.2f", totalApartment * 0.9);
                }
                break;

            case "president apartment":
                if (days <= 10) {
                    totalPresidentApartment *= 0.9;
                } else if (days > 10 && days <= 15) {
                    totalPresidentApartment *= 0.85;
                } else {
                    totalPresidentApartment *= 0.8;
                }
                if (feedback.equals("positive")) {
                    System.out.printf("%.2f", totalPresidentApartment * 1.25);
                } else {
                    System.out.printf("%.2f", totalPresidentApartment * 0.9);
                }
                break;
        }
    }
}
