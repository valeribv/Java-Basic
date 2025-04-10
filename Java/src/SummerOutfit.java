import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        double degree = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        String Outfit = "";
        String Shoes = "";

        //problem solve
        if (degree >= 10 && degree <= 18) {
            switch (day) {
                case "Morning":
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
                case "Afternoon":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
            }
        } else if (degree > 18 && degree <= 24) {
            switch (day) {
                case "Morning":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
                case "Afternoon":
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
            }
        } else if (degree >= 25) {
            switch (day) {
                case "Morning":
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
                case "Afternoon":
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    System.out.printf("It's %.0f degrees, get your %s and %s.", degree, Outfit, Shoes);
                    break;
            }
        }
    }
}