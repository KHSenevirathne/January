import java.util.Scanner;
import java.text.DecimalFormat;

public class LYConverter {
    public static void main(String[] args) {
        // Clear the console screen (Platform-independent instruction)
        // Clear the console screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Enter Light Years: ");

        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextDouble()) {
                double lightYears = scanner.nextDouble();

                // Constants
                double speedOfLight = 299792.458; // in km/s
                double secondsInAYear = 60 * 60 * 24 * 365;

                // Conversion
                double kilometers = lightYears * speedOfLight * secondsInAYear;

                // Format output
                DecimalFormat df = new DecimalFormat("#,###.##");
                System.out.println("Kilometers: " + df.format(kilometers));
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }
}

