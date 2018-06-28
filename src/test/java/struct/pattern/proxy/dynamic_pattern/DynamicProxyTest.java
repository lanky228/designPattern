package struct.pattern.proxy.dynamic_pattern;


import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    @Test
    public void test() {
        IDynamicTarget target = new DynamicTarget();
        DynamicTargetProxy proxy = new DynamicTargetProxy(target);
        IDynamicTarget targetProxy = (IDynamicTarget) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxy);
        targetProxy.run();
    }
}
