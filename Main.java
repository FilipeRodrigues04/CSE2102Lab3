public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza(PizzaType.Cheese);
        store.orderPizza(PizzaType.Pepperoni);
    }
}
