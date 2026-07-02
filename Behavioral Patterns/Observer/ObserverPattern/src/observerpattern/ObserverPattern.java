package observerpattern;

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("--- 1st Weather Measurement Update ---");
        weatherData.setMeasurements(80, 65, 30.4f);

        System.out.println("\n--- 2nd Weather Measurement Update ---");
        weatherData.setMeasurements(82, 70, 29.2f);

        System.out.println("\n--- Removing Forecast Display Observer ---");
        weatherData.removeObserver(forecastDisplay);

        System.out.println("\n--- 3rd Weather Measurement Update ---");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
