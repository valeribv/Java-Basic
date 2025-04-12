import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double examHour = Double.parseDouble(scanner.nextLine());
        double examMinutes = Double.parseDouble(scanner.nextLine());
        double arrivalHour = Double.parseDouble(scanner.nextLine());
        double arrivalMinutes = Double.parseDouble(scanner.nextLine());

        double examHoursToMinutes = examHour / 60;


        //on time
        if (examHour == arrivalHour && examMinutes >= arrivalMinutes) {
            System.out.println("On time");

            //late
        } else if (examHour < arrivalHour) {
            System.out.println("Late");

            //Early
        } else if (examHoursToMinutes > arrivalHour)
            if (arrivalMinutes > examMinutes - 30)
                System.out.println("Early");

    }
}
