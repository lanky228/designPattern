package action.pattern.strategy;

class Strategy {
    private IStrategyTarget strategyTarget;

    Strategy(IStrategyTarget strategyTarget) {
        this.strategyTarget = strategyTarget;
    }

    void doSomething(){
        strategyTarget.doSomething();
    }
}
