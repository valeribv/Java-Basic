import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

//        10464 -> world record [sec]
//        1500 -> distance [m]
//        20 -> time for 1 meter [sec]
//
        Scanner scanner = new Scanner(System.in);
        double neededSecondsForWorldRecord = Double.parseDouble(scanner.nextLine());
        double distanceForWorldRecord = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        //1st to find how much time he needs per meter
        double timePerMeter = distanceForWorldRecord * timeForOneMeter; // [m/s] per seconds for 1 meter

        //waterResistance = 15 m for 12.5 sec.
        double waterResistance = Math.floor(distanceForWorldRecord / 15) * 12.5; //[m/s] per seconds for 1 meter

        double totalTime = timePerMeter + waterResistance;

        if (neededSecondsForWorldRecord > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (totalTime - neededSecondsForWorldRecord));
        }
    }
}
