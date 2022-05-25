package simple;

public class PizzaFactory {

    Pizza preparePizza(String type) throws Exception {
        Pizza pizza;
        if (type.equals("simple.Napolitana")){
            pizza=new Napolitana();
            return pizza;
        }else if (type.equals("simple.Venetia")){
            pizza=new Venetia();
            return pizza;
        }
        throw new  Exception("pizza not found");
    }
}
