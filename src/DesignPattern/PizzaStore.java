package DesignPattern;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza chicagoPizza = pizzaFactory.getPizza("Chicago");
        Pizza nyPizza = pizzaFactory.getPizza("NewYork");

        chicagoPizza.bake();
        nyPizza.bake();
    }
}
