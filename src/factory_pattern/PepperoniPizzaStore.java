package factory_pattern;

public class PepperoniPizzaStore extends PizzaStore {

    @Override
    Pizza create(String type) {
        if (type.equals("pepperoni"))
            return new PepperoniPizza();

        return null;
    }
}
