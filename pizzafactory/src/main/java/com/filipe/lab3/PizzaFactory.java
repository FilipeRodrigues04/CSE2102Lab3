package com.filipe.lab3;

public class PizzaFactory {
    public static Pizza createPizza(PizzaType type) {
        switch (type) {
            case Cheese: return new CheesePizza(); 
            case Greek: return new GreekPizza();
            case Pepperoni: return new PepperoniPizza();
            case GlutenFree: return new GlutenFreePizza();
            case Vegan: return new VeganPizza();
            case Brazillian: return new BrazillianPizza();
            default: throw new IllegalArgumentException("Unknown pizza: " + type);
        }
    }
}
