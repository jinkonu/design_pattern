package observer_pattern.weather;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Weather weather;
    private WeatherSubject weatherSubject;

    public CurrentConditionDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        display();
    }

    @Override
    public void display() {
        System.out.println("weather.temperature() = " + weather.temperature());
        System.out.println("weather.humidity() = " + weather.humidity());
        System.out.println("weather.pressure() = " + weather.pressure());
        System.out.println();
    }
}
