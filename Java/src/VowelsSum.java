import java.util.Scanner;

public class VowelsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int counter = 0;
        int a = 1;
        int e = 2;
        int i = 3;
        int o = 4;
        int u = 5;

        for (int index = 0; index < text.length(); index++) {

            switch (text.charAt(index)) {
                case 'a':
                    counter += a;
                    break;
                case 'e':
                    counter += e;
                    break;

                case 'i':
                    counter += i;
                    break;

                case 'o':
                    counter += o;
                    break;

                case 'u':
                    counter += u;
                    break;
            }
        }
        System.out.println(counter);
    }
}
