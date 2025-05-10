import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (true){
            input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }
            System.out.println(input);
        }


//        int a = 5;
//        while (true) {
//            if (a > 10) {
//                break;
//            }
//            System.out.println("a = " + a);
//            a++;
    }
}

