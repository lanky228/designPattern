package create.pattern.singleton;

public class Singleton {
    private static Singleton object = new Singleton();

    public static Singleton getObject() {
        return object;
    }
}
