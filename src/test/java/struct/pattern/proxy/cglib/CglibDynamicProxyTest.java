package struct.pattern.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.Test;

class CglibDynamicProxyTest {
    @Test
    void test() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibTaget.class);
        enhancer.setCallback(new CglibDynamicProxy());
        CglibTaget student = (CglibTaget) enhancer.create();
        student.doSomthing();
    }
}
