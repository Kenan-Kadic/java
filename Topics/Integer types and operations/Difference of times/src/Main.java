import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the first moment's time (hours, minutes, seconds)
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        // Read the second moment's time (hours, minutes, seconds)
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the first moment's time in seconds
        int time1InSeconds = hours1 * 3600 + minutes1 * 60 + seconds1;

        // Calculate the second moment's time in seconds
        int time2InSeconds = hours2 * 3600 + minutes2 * 60 + seconds2;

        // Calculate the time difference in seconds
        int timeDifferenceInSeconds = time2InSeconds - time1InSeconds;

        // Print the time difference in seconds
        System.out.println(timeDifferenceInSeconds);
    }
}
