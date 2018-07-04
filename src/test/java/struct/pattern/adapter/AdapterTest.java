package struct.pattern.adapter;

import org.junit.jupiter.api.Test;

class AdapterTest {
    @Test
    void test(){
        IAdapter adapter = new Adapter(new AdapterTarget());
        adapter.doSomething();
    }
}
