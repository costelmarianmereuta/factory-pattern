package complex.pizzas;

public class PizzaParisienne extends Pizza {

    public PizzaParisienne() {
        description="pizza parisienne";
    }

    @Override
    public void cuire() {
        System.out.println("cuire en 10 minutes");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage double");
    }

    @Override
    public void couper() {
        System.out.println("decoupe en 7 morceaux");
    }

    @Override
    public void preparer() {
        System.out.println("preparation en 7 min");
    }
}
