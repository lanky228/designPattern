package action.pattern.strategy;

import org.junit.jupiter.api.Test;

class StrategyTest {
    @Test
    void doSomething() {
        Strategy strategy = new Strategy(new StrategyTargetTarget());
        strategy.doSomething();
        strategy = new Strategy(new StrategyTargetTarget1());
        strategy.doSomething();
    }

}
