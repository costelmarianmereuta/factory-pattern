package complex.fabriques;

import complex.pizzas.Pizza;
import complex.pizzas.PizzaFromage;
import complex.pizzas.PizzaFruitsDeMer;
import complex.pizzas.PizzaParisienne;

public class FabriquePizzaParis implements FabriquePizza{

    @Override
    public Pizza creerPizza(String type) {
        Pizza pizza=null;
        if (type.equals("Fromage"))
            pizza=new PizzaFromage();
        else if (type.equals("Fruits")){
            pizza=new PizzaFruitsDeMer();
        }else if (type.equals("Paris")){
            pizza=new PizzaParisienne();
        }
        return pizza;
    }
}
