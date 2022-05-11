package DesignPattern;

public class PizzaFactory {
    public Pizza getPizza(String pizza) {
        if(pizza.equals("Chicago")) {
            return new ChicagoPizza();
        }else if(pizza.equals("NewYork")) {
            return new NYPizza();
        } else {
            return null;
        }
    }
}
