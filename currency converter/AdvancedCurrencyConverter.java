import java.util.Scanner;

public class AdvancedCurrencyConverter {
    private static Scanner scanner = new Scanner(System.in);

    // Default conversion rates
    private static double usdToInr = 82.65;
    private static double eurToInr = 90.30;
    private static double gbpToInr = 104.70;
    private static double jpyToInr = 0.56;
    private static double audToInr = 53.10;

    public static void main(String[] args) {
        System.out.println("=== Welcome to the Advanced Currency Converter ===");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert Currency");
            System.out.println("2. View Conversion Rates");
            System.out.println("3. Update Conversion Rates");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertCurrency();
                    break;
                case 2:
                    viewConversionRates();
                    break;
                case 3:
                    updateConversionRates();
                    break;
                case 4:
                    System.out.println("Thank you for using the Currency Converter. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void convertCurrency() {
        System.out.println("\nChoose the currency pair for conversion:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.println("4. JPY to INR");
        System.out.println("5. AUD to INR");
        System.out.println("6. INR to USD");
        System.out.println("7. INR to EUR");
        System.out.println("8. INR to GBP");
        System.out.println("9. INR to JPY");
        System.out.println("10. INR to AUD");

        System.out.print("Enter your choice (1-10): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0.0;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToInr;
                System.out.printf("%.2f USD = %.2f INR\n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = amount * eurToInr;
                System.out.printf("%.2f EUR = %.2f INR\n", amount, convertedAmount);
                break;
            case 3:
                convertedAmount = amount * gbpToInr;
                System.out.printf("%.2f GBP = %.2f INR\n", amount, convertedAmount);
                break;
            case 4:
                convertedAmount = amount * jpyToInr;
                System.out.printf("%.2f JPY = %.2f INR\n", amount, convertedAmount);
                break;
            case 5:
                convertedAmount = amount * audToInr;
                System.out.printf("%.2f AUD = %.2f INR\n", amount, convertedAmount);
                break;
            case 6:
                convertedAmount = amount / usdToInr;
                System.out.printf("%.2f INR = %.2f USD\n", amount, convertedAmount);
                break;
            case 7:
                convertedAmount = amount / eurToInr;
                System.out.printf("%.2f INR = %.2f EUR\n", amount, convertedAmount);
                break;
            case 8:
                convertedAmount = amount / gbpToInr;
                System.out.printf("%.2f INR = %.2f GBP\n", amount, convertedAmount);
                break;
            case 9:
                convertedAmount = amount / jpyToInr;
                System.out.printf("%.2f INR = %.2f JPY\n", amount, convertedAmount);
                break;
            case 10:
                convertedAmount = amount / audToInr;
                System.out.printf("%.2f INR = %.2f AUD\n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void viewConversionRates() {
        System.out.println("\nCurrent Conversion Rates:");
        System.out.printf("1. USD to INR: %.2f\n", usdToInr);
        System.out.printf("2. EUR to INR: %.2f\n", eurToInr);
        System.out.printf("3. GBP to INR: %.2f\n", gbpToInr);
        System.out.printf("4. JPY to INR: %.2f\n", jpyToInr);
        System.out.printf("5. AUD to INR: %.2f\n", audToInr);
    }

    private static void updateConversionRates() {
        System.out.println("\nUpdate Conversion Rates:");
        System.out.print("Enter new USD to INR rate: ");
        usdToInr = scanner.nextDouble();

        System.out.print("Enter new EUR to INR rate: ");
        eurToInr = scanner.nextDouble();

        System.out.print("Enter new GBP to INR rate: ");
        gbpToInr = scanner.nextDouble();

        System.out.print("Enter new JPY to INR rate: ");
        jpyToInr = scanner.nextDouble();

        System.out.print("Enter new AUD to INR rate: ");
        audToInr = scanner.nextDouble();

        System.out.println("Conversion rates updated successfully!");
    }
}
