package create.pattern.factory;


import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void test() {
        IAbstractFactory factory = new Factory1();
        System.out.println(factory.create());
        factory = new Factory2();
        System.out.println(factory.create());
    }
}
