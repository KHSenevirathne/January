import java.util.Scanner;

public class LYConverter {
    public static void main(String[] args) {
        // Clear the console screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Enter Light Years : ");

        Scanner scanner = new Scanner(System.in);
        double lightYears = scanner.nextDouble();

        double kilometers = lightYears * 299792.458 * 60 * 60 * 24 * 365 ;

        System.out.println("Kilometers : " + kilometers);
    }
}
