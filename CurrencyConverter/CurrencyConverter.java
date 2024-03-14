import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Fetch exchange rates
        ExchangeRateFetcher exchangeRateFetcher = new ExchangeRateFetcher();
        exchangeRateFetcher.fetchExchangeRates();

        // Get user input
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the base currency:");
            String baseCurrency = reader.readLine().toUpperCase();

            System.out.println("Enter the target currency:");
            String targetCurrency = reader.readLine().toUpperCase();

            System.out.println("Enter the amount to convert:");
            double amount = Double.parseDouble(reader.readLine());

            // Convert currency
            double convertedAmount = exchangeRateFetcher.convertCurrency(baseCurrency, targetCurrency, amount);

            // Display result
            System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
