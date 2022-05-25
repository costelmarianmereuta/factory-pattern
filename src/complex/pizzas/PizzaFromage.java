package complex.pizzas;

public class PizzaFromage extends Pizza {

    public PizzaFromage() {
        description="pizza au fromage";
    }

    @Override
    public void cuire() {
        System.out.println("cuire en 5 minutes");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage simple");
    }

    @Override
    public void couper() {
        System.out.println("decoupe en 4 morceaux");
    }

    @Override
    public void preparer() {
        System.out.println("preparation en 4 min");
    }
}
