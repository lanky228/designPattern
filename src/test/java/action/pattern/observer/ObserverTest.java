package action.pattern.observer;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

class ObserverTest {
    @Test
    void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ObserverTarget observerTarget = new ObserverTarget();
        Observer observer = new Observer();
        observerTarget.registe("doSomething", new ServiceHandle(observer, observer.getClass(), observer.getClass().getMethod("doSomething")));
        observerTarget.doSomgthing();
    }
}
