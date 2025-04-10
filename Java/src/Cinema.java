import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinemaType = scanner.nextLine();
        double colum = Double.parseDouble(scanner.nextLine());
        double rows = Double.parseDouble(scanner.nextLine());
        double price = 0;

//        switch (cinemaType){
//            case "Premiere":
//                price = colum * rows;
//                System.out.printf("%.2f lv", price * 12);
//                break;
//            case "Normal":
//                price = colum * rows;
//                System.out.printf("%.2f lv", price * 7.5);
//                break;
//            case "Discount":
//                price = colum * rows;
//                System.out.printf("%.2f lv", price * 5);
//                break;
//            default: System.out.println("error");

        if (cinemaType.equals("Premiere")) {
            price = (colum * rows) * 12;
            System.out.printf("%.2f" , price);
            System.out.println(" leva");
        } else if (cinemaType.equals("Normal")) {
            price = (colum * rows) * 7.5;
            System.out.printf("%.2f", price);
            System.out.println(" leva");
        } else if (cinemaType.equals("Discount")) {
            price = (colum * rows) * 5;
            System.out.printf("%.2f", price);
            System.out.println(" leva");
        }
    }
}
