package action.pattern.visitor;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class VisitorTest {
    @Test
    void test() throws IllegalAccessException, InvocationTargetException {
        Visitor visitor = new Visitor();
        VisitorTarget visitorTarget = new VisitorTarget();
        for (Method item : visitorTarget.getClass().getMethods()) {
            visitor.registe(visitorTarget.getClass().getName() + "/" + item.getName(), new ServiceHandle(visitorTarget, visitorTarget.getClass(), item));
        }
        visitor.doSomething("action.pattern.visitor.VisitorTarget/doSomething", "str1", "str2");
    }
}
