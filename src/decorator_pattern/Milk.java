package decorator_pattern;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;

        switch (beverage.getSize()) {
            case TALL:
                cost = .10;
                break;
            case GRANDE:
                cost = .15;
                break;
            case VENTI:
                cost = .20;
                break;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with Milk";
    }

    @Override
    public double cost() {
        return cost + beverage.cost();
    }
}
