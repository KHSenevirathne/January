import java.util.Scanner;

class TempConverter{
    public static void main(String[] args) {

        // Clear the console screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Display welcome message
        System.out.println("Select One :\n1. Celcius\n2. Fahrenheit\n3. Kelvin");

        try (// Get user's choice
        Scanner input = new Scanner(System.in)) {
            int choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter temperature in Celsius:");
                    double celsius = input.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    double kelvin = celsius + 273.15;
                    System.out.printf("Temperature in Fahrenheit: %.2f°F\nTemperature in Kelvin: %.2fK%n", fahrenheit, kelvin);

                    break;

                case 2:
                    System.out.println("Enter temperature in Fahrenheit:");
                    double fahrenheit1 = input.nextDouble();
                    double celsius1 = (fahrenheit1 - 32) * 5/9;
                    double kelvin1 = (fahrenheit1 - 32) * 5/9 + 273.15;
                    System.out.printf("Temperature in Celsius: %.2f°C\nTemperature in Kelvin: %.2fK%n", celsius1, kelvin1);

                    break;
                    
                case 3:
                    System.out.println("Enter temperature in Kelvin:");
                    double kelvin2 = input.nextDouble();
                    double celsius2 = kelvin2 - 273.15;
                    double fahrenheit2 = (celsius2 * 9/5) + 32;
                    System.out.printf("Temperature in Celsius: %.2f°C\nTemperature in Fahrenheit: %.2f°F%n", celsius2, fahrenheit2);

                    break;
                    
                case 4:
                    
                default:
                System.out.println("Invalid choice. Please try again.");

                break;
            }
        }
    
    }
}