package simple;

public class Napolitana implements Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare simple.Napolitana");
    }

    @Override
    public void cook() {
        System.out.println("cook 12 min");
    }

    @Override
    public void cut() {
        System.out.println("cut in 6 slices");
    }

    @Override
    public void box() {
        System.out.println("box in for simple.Napolitana");
    }
}
