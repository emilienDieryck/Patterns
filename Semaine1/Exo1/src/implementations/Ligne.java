package implementations;

import interfaces.Observer;

public class Ligne implements Observer {

    private int nbrLignes = 0;
    @Override
    public void update(String line) {
        if (line == null) {
            afficher();
        }
        else if(!line.isBlank()){
            nbrLignes++;
        }
    }

    @Override
    public void afficher() {
        System.out.println("Il y avait " + nbrLignes + " lignes.");
    }
}
