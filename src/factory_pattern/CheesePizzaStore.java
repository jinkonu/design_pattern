package factory_pattern;

public class CheesePizzaStore extends PizzaStore {

    @Override
    Pizza create(String type) {
        if (type.equals("cheese"))
            return new CheesePizza();

        return null;
    }
}
