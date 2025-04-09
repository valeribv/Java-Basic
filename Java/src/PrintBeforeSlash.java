import java.util.Scanner;

public class PrintBeforeSlash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user for input
            String input = scanner.nextLine();

            // Find the position of the first slash "/"
            int slashIndex = input.indexOf("/");

            // Check if there's a slash in the input
            if (slashIndex != -1) {
                // Extract the text before the slash
                String beforeSlash = input.substring(0, slashIndex);
                // System.out.println(beforeSlash);
            } else {
                //System.out.println("No slash symbol '/' found in the input.");
            }
            // Refactor the input (remove the part after the slash)
            String refactoredInput = input.split("/")[0]; // Text before the slash part
            System.out.println(refactoredInput);
            //    System.out.println();
        }
    }
}


