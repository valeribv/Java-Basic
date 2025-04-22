import java.util.Scanner;

public class Oscars {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        double quantityOfJury = Double.parseDouble(scanner.nextLine());

        double sumPoints = 0;
        double countPoints = 0;
        int pointFromJuryName = 0;

        double finalPoints = 1250.5;

        for (int index = 1; index <= quantityOfJury; index++) {

            String JuryName = scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());

            for (int j = 0; j <= JuryName.length() - 1; j++) {
                pointFromJuryName++;
            }
            countPoints = ((pointFromJuryName * pointsFromJury) / 2);
            pointsFromAcademy += countPoints;
            sumPoints = countPoints;
            pointFromJuryName = 0;
        }
        if (sumPoints >= 0 || sumPoints <= finalPoints) {
            System.out.printf("Sorry, %s you need %.2f more!", actorName, (finalPoints - sumPoints));
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.2f!", actorName, (finalPoints - sumPoints));
        }
    }
}
