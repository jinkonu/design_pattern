package decorator_pattern;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    double cost;

    public abstract String getDescription();
}
