package complex;

import complex.fabriques.FabriqueCasa;
import complex.pizzas.Pizza;

public class AppComplex {
    public static void main(String[] args) {
        Pizzeria pizzeria=new Pizzeria(new FabriqueCasa());
        Pizza pizza = pizzeria.commanderPizza("Fromage");
        System.out.println(pizza.getDescription()
        );
    }
}
