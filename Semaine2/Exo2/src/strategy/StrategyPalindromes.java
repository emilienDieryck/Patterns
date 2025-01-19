package strategy;

import interfaces.Strategy;

public class StrategyPalindromes implements Strategy {


    @Override
    public boolean estValide(String mot) {
        return mot.contentEquals(new StringBuffer(mot).reverse());
    }
}
