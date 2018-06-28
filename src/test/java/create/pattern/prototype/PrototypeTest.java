package create.pattern.prototype;


import org.junit.jupiter.api.Test;

public class PrototypeTest {
    @Test
    public void test() {
        Prototype prototype = new Prototype();
        prototype = prototype.clone();
        System.out.println(prototype);
    }
}
