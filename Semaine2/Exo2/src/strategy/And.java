package strategy;

import interfaces.Strategy;

public class And implements Strategy {

    private Strategy strategy1;
    private Strategy strategy2;

    public And(Strategy strategy1, Strategy strategy2) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
    }

    @Override
    public boolean estValide(String mot) {
        return strategy1.estValide(mot) && strategy2.estValide(mot);
    }
}
