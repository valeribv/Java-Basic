import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberQuantity = Integer.parseInt(scanner.nextLine());
        double numberP1 = 0;
        double numberP2 = 0;
        double numberP3 = 0;
        double numberP4 = 0;
        double numberP5 = 0;

        for (int index = 1; index <= numberQuantity; index++) {

            double inputNumber = Double.parseDouble(scanner.nextLine());

            if (inputNumber < 200) {
             numberP1++;
            } else if (inputNumber >= 200 && inputNumber <= 399) {
                numberP2++;
            } else if (inputNumber >= 400 && inputNumber <= 599) {
                numberP3++;
            } else if (inputNumber >= 600 && inputNumber <= 799) {
                numberP4++;
            } else {
                numberP5++;
            }
        }
                System.out.printf("%.2f%%%n", numberP1 * 100 /numberQuantity);
                System.out.printf("%.2f%%%n", numberP2 * 100 /numberQuantity);
                System.out.printf("%.2f%%%n", numberP3 * 100 /numberQuantity);
                System.out.printf("%.2f%%%n", numberP4 * 100 /numberQuantity);
                System.out.printf("%.2f%%%n", numberP5 * 100 /numberQuantity);
    }
}