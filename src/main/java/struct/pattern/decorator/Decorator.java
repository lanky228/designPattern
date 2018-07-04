package struct.pattern.decorator;

class Decorator extends DecoratorTarget {
    private DecoratorTarget target;
    Decorator(DecoratorTarget target) {
        this.target = target;
    }

    @Override
    void doSomething() {
        super.doSomething();
        System.out.println("Decorator");
    }
}
