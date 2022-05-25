package complex.fabriques;

import complex.pizzas.Pizza;
import complex.pizzas.PizzaFromage;
import complex.pizzas.PizzaFruitsDeMer;

public class FabriqueCasa implements FabriquePizza{

    @Override
    public Pizza creerPizza(String type) {
        Pizza pizza=null;
        if (type.equals("Fromage"))
            pizza=new PizzaFromage();
        else if (type.equals("Fruits")){
            pizza=new PizzaFruitsDeMer();
        }
        return pizza;
    }
}
