import java.util.Scanner;

public class WeatherForecast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city name: ");
        String city = scanner.nextLine();

        // Simulated weather forecast (could be replaced with an API call for live data)
        String forecast = getWeatherForecast(city);

        System.out.println("Weather forecast for " + city + ": " + forecast);
        scanner.close();
    }

    // Simulate weather data
    public static String getWeatherForecast(String city) {
        // Hardcoded weather data for demonstration purposes
        switch (city.toLowerCase()) {
            case "new york":
                return "Sunny, 25°C";
            case "london":
                return "Cloudy, 18°C";
            case "sydney":
                return "Rainy, 22°C";
            case "tokyo":
                return "Clear sky, 27°C";
            default:
                return "Weather data not available for this location.";
        }
    }
}
