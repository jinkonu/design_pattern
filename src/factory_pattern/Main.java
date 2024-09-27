package factory_pattern;

public class Main {

    public static void main(String[] args) {
        String type = "cheese";

        CheesePizzaStore cheesePizzaStore = new CheesePizzaStore();
        Pizza pizza = cheesePizzaStore.order("cheese");


    }
}
