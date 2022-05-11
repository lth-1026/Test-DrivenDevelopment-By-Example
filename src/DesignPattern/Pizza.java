package DesignPattern;

abstract public class Pizza {
    protected int radius;

    public double getPizzaSize() {
        return radius*radius*3.14;
    }

    abstract public void bake();
}
