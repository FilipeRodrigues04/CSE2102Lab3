import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaTest {
    @Test
    public void testCheesePizzaPrepare() {
        Pizza pizza = new CheesePizza();
        pizza.prepare();
        assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void testGreekPizzaPrepare() {
        Pizza pizza = new GreekPizza();
        pizza.prepare();
        assertTrue(pizza instanceof GreekPizza);
    }

    @Test
    public void testPepperoniPizzaPrepare() {
        Pizza pizza = new PepperoniPizza();
        pizza.prepare();
        assertTrue(pizza instanceof PepperoniPizza);
    }

    @Test
    public void testGlutenFreePizzaPrepare() {
        Pizza pizza = new GlutenFreePizza();
        pizza.prepare();
        assertTrue(pizza instanceof GlutenFreePizza);
    }

    @Test
    public void testVeganPizzaPrepare() {
        Pizza pizza = new VeganPizza();
        pizza.prepare();
        assertTrue(pizza instanceof VeganPizza);
    }

    @Test
    public void testBrazilianPizzaPrepare() {
        Pizza pizza = new BrazillianPizza();
        pizza.prepare();
        assertTrue(pizza instanceof BrazillianPizza);
    }
}
