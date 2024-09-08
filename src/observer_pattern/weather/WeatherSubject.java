package observer_pattern.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {

    private Weather weather;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(weather));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(Weather weather) {
        this.weather = weather;
        measurementsChanged();
    }
}
