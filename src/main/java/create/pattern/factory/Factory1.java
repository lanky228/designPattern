package create.pattern.factory;

public class Factory1 implements IAbstractFactory {
    @Override
    public IFactoryProduct create() {
        return new FactoryProduct1();
    }
}
