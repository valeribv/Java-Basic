import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputCompetitions = Integer.parseInt(scanner.nextLine());
        int pointsInRankList = Integer.parseInt(scanner.nextLine());

        double sumAllPoints = 0;
        double win = 0;

        for (int index = 1; index <= inputCompetitions; index++) {

            String type = scanner.nextLine();

            switch (type) {
                case "W":
                    sumAllPoints += 2000;
                    win++;
                    break;
                case "F":
                    sumAllPoints += 1200;
                    break;
                case "SF":
                    sumAllPoints += 720;
            }
        }
        System.out.printf("Final points: %.0f%n", sumAllPoints + pointsInRankList);
        System.out.printf("Average points: %.0f%n", sumAllPoints / inputCompetitions);
        System.out.printf("%.2f%%", (win / inputCompetitions) * 100);
    }
}