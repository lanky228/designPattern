package create.pattern.factory;

public class Factory2 implements IAbstractFactory {
    @Override
    public IFactoryProduct create() {
        return new FactoryProduct2();
    }
}
