package strategy;

import interfaces.Strategy;

public class StrategyLength implements Strategy {

    private int length;

    public StrategyLength(int length) {
        this.length = length;
    }

    @Override
    public boolean estValide(String mot) {
        return mot.length() == length;
    }
}
