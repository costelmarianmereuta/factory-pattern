package complex;

import complex.fabriques.FabriquePizza;
import complex.pizzas.Pizza;

public class Pizzeria {
   private FabriquePizza fabriquePizza;

    /**
     *
     * on lui passe en parametre la fabrique à chaque fois
     */
    public Pizzeria(FabriquePizza fabriquePizza) {
        this.fabriquePizza = fabriquePizza;
    }

    public Pizza commanderPizza(String type){
        Pizza pizza=fabriquePizza.creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();
        return pizza;
    }
}
