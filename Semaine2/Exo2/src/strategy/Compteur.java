package strategy;

import interfaces.Strategy;


/* Class Compteur dans l'exo
 * Strategy utilisé ici Decorator
 */
public class Compteur implements Strategy {

    private final Strategy strategy;
    private int count;

    public Compteur(Strategy strategy) {
        this.strategy = strategy;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }
    
    @Override
    public boolean estValide(String mot) {
        boolean estValid = strategy.estValide(mot);
        if (estValid) {
            count++;
        }
        return estValid;
    }
}
