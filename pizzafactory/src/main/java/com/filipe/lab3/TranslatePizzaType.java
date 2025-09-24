package com.filipe.lab3;

public class TranslatePizzaType {
    public static String fromPizzaTypeEnumToString(PizzaType pizzaType) {
        switch (pizzaType) {
            case Cheese: return "Cheese";
            case Pepperoni: return "Pepperoni";
            case Greek: return "Greek";
            case GlutenFree: return "GlutenFree";
            case Vegan: return "Vegan";
            case Brazillian: return "Brazillian";
            default: return "Unknown";
        }
}
}
