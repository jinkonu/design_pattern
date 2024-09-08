package observer_pattern.weather;

public class Main {

    public static void main(String[] args) {
        WeatherSubject weatherData = new WeatherSubject();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(new Weather(80, 65, 30.4));
        weatherData.setMeasurements(new Weather(82, 70, 29.2));
        weatherData.setMeasurements(new Weather(78, 90, 29.2));
    }
}
