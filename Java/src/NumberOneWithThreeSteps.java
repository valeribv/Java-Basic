import java.util.Scanner;

public class NumberOneWithThreeSteps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 1; index <= number; index+=3){
        System.out.println(index);
        }
    }
}