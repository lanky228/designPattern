package struct.pattern.adapter;

public class Adapter implements IAdapter {
    private IAdapter target;
    Adapter(IAdapter target) {
        this.target  = target;
    }

    @Override
    public void doSomething() {
        this.target.doSomething();
        System.out.println("Adapter");
    }
}
