package struct.pattern.adapter;

public class AdapterTarget implements IAdapter {
    @Override
    public void doSomething() {
        System.out.println("AdapterTarget");
    }
}
