package simple;

public class App {
    public static void main(String[] args) throws Exception {
        PizzaFactory pizzaFactory=new PizzaFactory();
        Pizza pizza = pizzaFactory.preparePizza("simple.Napolitana");
        pizza.box();
        pizza.cook();
        pizza.cut();
        pizza.prepare();
    }
}
