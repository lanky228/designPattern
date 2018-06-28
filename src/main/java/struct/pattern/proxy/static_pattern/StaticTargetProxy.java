package struct.pattern.proxy.static_pattern;

public class StaticTargetProxy implements IStaticTarget {
    private IStaticTarget target;

    StaticTargetProxy(IStaticTarget target) {
        this.target = target;
    }

    @Override
    public void run() {
        target.run();
    }
}
