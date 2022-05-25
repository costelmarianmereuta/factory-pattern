package complex.pizzas;

public abstract class Pizza {
    String description;

    public String getDescription() {
        return description;
    }

   public abstract void cuire();
   public abstract void emballer();
   public abstract void couper();
   public abstract void preparer();

}
