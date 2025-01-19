package implementations;

import interfaces.Observer;

public class Mots implements Observer {

    private int nbrMots = 0;
    @Override
    public void update(String line) {
        if (line == null) {
            afficher();
        }
        else {
            for (String mot : line.trim().split(" ")) {
                nbrMots++;
            }
        }
    }

    @Override
    public void afficher() {
        System.out.println("Il y avait " + nbrMots + " mots.");
    }
}
