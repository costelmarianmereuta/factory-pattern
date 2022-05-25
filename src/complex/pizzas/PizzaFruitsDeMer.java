package complex.pizzas;

public class PizzaFruitsDeMer extends Pizza {

    public PizzaFruitsDeMer() {
        description="pizza au fruits de mer";
    }

    @Override
    public void cuire() {
        System.out.println("cuire en 6 minutes");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage simple");
    }

    @Override
    public void couper() {
        System.out.println("decoupe en 6 morceaux");
    }

    @Override
    public void preparer() {
        System.out.println("preparation en 10 min");
    }
}
