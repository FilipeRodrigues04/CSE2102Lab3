package com.filipe.lab3;

public class PizzaStore {
    public void orderPizza(PizzaType type) {
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
