import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRateFetcher {
    private Map<String, Double> exchangeRates;

    public void fetchExchangeRates() {
        // Fetch exchange rates from text file (dummy API)
        exchangeRates = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("exchange_rates.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String currency = parts[0].trim().toUpperCase();
                double rate = Double.parseDouble(parts[1].trim());
                exchangeRates.put(currency, rate);
            }
        } catch (IOException e) {
            System.out.println("Error reading exchange rates: " + e.getMessage());
        }
    }

    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {
        double baseRate = exchangeRates.getOrDefault(baseCurrency, 1.0);
        double targetRate = exchangeRates.getOrDefault(targetCurrency, 1.0);
        return (amount / baseRate) * targetRate;
    }
}
