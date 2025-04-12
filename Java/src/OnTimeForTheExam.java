import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examHoursToMinutes = examHour * 60 + examMinutes;
        int arrivalHoursToMinutes = arrivalHour * 60 + arrivalMinutes;

        int difference =  arrivalHoursToMinutes - examHoursToMinutes;
        int hours = 0;
        int minutes = 0;

        if (difference > 0) {
            System.out.println("Late");
            if (difference < 60) {
                System.out.printf("%d minutes after the start%n", difference);
            } else {
                hours = difference / 60;
                minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start%n", hours, minutes);
            }
        } else if (difference == 0 || difference >= -30) {
            System.out.println("On time");
            if (difference != 0) {
                System.out.printf("%d minutes before the start%n", Math.abs(difference));
            }
        } else {
            System.out.println("Early");
            if (Math.abs(difference) < 60) {
                System.out.printf("%d minutes before the start%n", Math.abs(difference));
            } else {
                hours = Math.abs(difference) / 60;
                minutes = Math.abs(difference) % 60;
                System.out.printf("%d:%02d hours before the start%n", hours, minutes);
            }
        }
    }
}

