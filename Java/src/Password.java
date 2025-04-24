import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();
        String inputPassword = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(inputPassword)){
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", inputName);
    }
}
