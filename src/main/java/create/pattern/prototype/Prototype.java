package create.pattern.prototype;

public class Prototype implements Cloneable {
    protected Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;

    }
}
