import java.util.Scanner;

public class PersonalTitles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();

        switch (type) {
            case "m":
                if (age >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
                break;
            case "f":
                if (age >= 16){
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
         //   default:System.out.println("Error");
        }
    }
}
