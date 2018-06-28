package struct.pattern.proxy.static_pattern;


import org.junit.jupiter.api.Test;

public class StaticProxyTest {
    @Test
    public void test() {
        IStaticTarget target = new StaticTarget();
        IStaticTarget targetProxy = new StaticTargetProxy(target);
        targetProxy.run();
    }
}
