import java.util.Scanner;

public class TrekkingMania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());

        int countPeoplesMusala = 0;
        int countPeoplesMonbalnd = 0;
        int countPeoplesKilimanjaro = 0;
        int countPeoplesK2 = 0;
        int countPeoplesEverest = 0;
        int onePerson = 0;
        double sumAll = 0;

        for (int index = 1; index <= peoples; index++) {

            onePerson = Integer.parseInt(scanner.nextLine());

            if (onePerson <= 5) {
                sumAll += onePerson;
                countPeoplesMusala += onePerson;

            } else if (onePerson >= 6 && onePerson <= 12) {
                sumAll += onePerson;
                countPeoplesMonbalnd += onePerson;

            } else if (onePerson >= 13 && onePerson <= 25) {
                sumAll += onePerson;
                countPeoplesKilimanjaro += onePerson;

            } else if (onePerson >= 26 && onePerson <= 40) {
                sumAll += onePerson;
                countPeoplesK2 += onePerson;

            } else if (onePerson >= 41) {
                sumAll += onePerson;
                countPeoplesEverest += onePerson;
            }
        }
        System.out.printf("%.2f%%%n", countPeoplesMusala * 100 / sumAll);
        System.out.printf("%.2f%%%n", countPeoplesMonbalnd * 100 / sumAll);
        System.out.printf("%.2f%%%n", countPeoplesKilimanjaro * 100 / sumAll);
        System.out.printf("%.2f%%%n", countPeoplesK2 * 100 / sumAll);
        System.out.printf("%.2f%%%n", countPeoplesEverest * 100 / sumAll);
    }
}