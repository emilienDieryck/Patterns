package strategy;

import interfaces.Strategy;

public class StrategyStartWith implements Strategy {

    private String prefixe;

    public StrategyStartWith(String prefixe) {
        this.prefixe = prefixe;
    }

    @Override
    public boolean estValide(String mot) {
        return mot.startsWith(prefixe);
    }

}
