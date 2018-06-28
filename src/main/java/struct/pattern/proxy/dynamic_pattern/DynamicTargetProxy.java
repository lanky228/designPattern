package struct.pattern.proxy.dynamic_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicTargetProxy implements InvocationHandler{
    private Object target;

    DynamicTargetProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object targetProxy = method.invoke(target, args);
        return targetProxy;
    }


}
