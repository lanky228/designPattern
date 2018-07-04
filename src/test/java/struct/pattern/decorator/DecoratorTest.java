package struct.pattern.decorator;

import org.junit.jupiter.api.Test;

class DecoratorTest {
    @Test
    void test(){
        Decorator decorator = new Decorator(new DecoratorTarget());
        decorator.doSomething();
    }
}
