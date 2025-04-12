import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double days = Double.parseDouble(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        double apartment = 0;
        double studio = 0;

        switch (month) {
            case "May":
            case "October":
                apartment = 65;
                studio = 50;
                if (days >= 1 && days <= 7 || days <= 14) {
                    priceApartment = apartment * days;
                    priceStudio = (studio * 0.95) * days;
                    System.out.printf("Apartment: %.2f lv.\n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else if (days > 14) {
                    priceStudio = (studio * 0.7) * days;
                    priceApartment = (apartment * 0.9) * days;
                    System.out.printf("Apartment: %.2f lv.\n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                }
                break;

            case "June":
            case "September":
                apartment = 68.7;
                studio = 75.2;
                if (days >= 1 && days <= 7 || days <= 14) {
                    priceApartment = apartment * days;
                    priceStudio = studio * days;
                    System.out.printf("Apartment: %.2f lv.\n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else if (days > 14) {
                    priceStudio = (studio * days) * 0.8;
                    priceApartment = (apartment * days) * 0.9;
                    System.out.printf("Apartment: %.2f lv.\n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                }
                break;

            case "July":
            case "August":
                apartment = 77;
                studio = 76;
                if (days >= 1 && days <= 7 || days <= 14) {
                    priceApartment = apartment * days;
                    priceStudio = studio * days;
                    System.out.printf("Apartment: %.2f lv.\n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                } else if (days > 14) {
                    priceApartment = (apartment * days) * 0.9;
                    priceStudio = studio * days;
                    System.out.printf("Apartment: %.2f lv.\n", priceApartment);
                    System.out.printf("Studio: %.2f lv.", priceStudio);
                }
                break;
        }
    }
}