import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int Facebook = 150;
        int Instagram = 150;
        int Reddit = 150;

        for (int index = 1; index <= input; index++) {

            String website = scanner.nextLine();

            if (website.equals("Facebook") || website.equals("Instagram") || website.equals("Reddit")) {
                switch (website) {
                    case "Facebook":
                        salary -= Facebook;
                        break;
                    case "Instagram":
                        salary -= Instagram;
                        break;
                    case "Reddit":
                        salary -= Reddit;
                        break;
                }
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {

            System.out.println(salary);
        }
    }
}
