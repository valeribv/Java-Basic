import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinemaType = scanner.nextLine();
        double colum = Double.parseDouble(scanner.nextLine());
        double rows = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (cinemaType){
            case "Premiere":
                price = colum * rows;
                System.out.printf("%.2f lv", price * 12);
                break;
            case "Normal":
                price = colum * rows;
                System.out.printf("%.2f lv", price * 7.5);
                break;
            case "Discount":
                price = colum * rows;
                System.out.printf("%.2f lv", price * 5);
                break;
            default: System.out.println("error");
        }
    }
}
