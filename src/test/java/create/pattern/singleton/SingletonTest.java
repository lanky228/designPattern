package create.pattern.singleton;


import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void test() {
       for(int i = 0; i < 10; i ++){
           Singleton object = Singleton.getObject();
           System.out.println(object);
       }
    }
}
