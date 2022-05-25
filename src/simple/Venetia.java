package simple;

public class Venetia implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare simple.Venetia");
    }

    @Override
    public void cook() {
        System.out.println("cook 10 min");
    }

    @Override
    public void cut() {
        System.out.println("cut in 5 slices");
    }

    @Override
    public void box() {
        System.out.println("box in for simple.Venetia");
    }
}
