package strategy;

import interfaces.Strategy;

public class Not implements Strategy {

    private Strategy strategy;

    public Not(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean estValide(String mot) {
        return !strategy.estValide(mot);
    }
}
