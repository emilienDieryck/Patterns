package implementations;

import interfaces.Observer;

public class Belgique implements Observer {

    private int nbrBelgique = 0;

    @Override
    public void update(String line) {
        if (line == null) {
            afficher();
        }
        else if (line.equalsIgnoreCase("belgique")) {
            nbrBelgique++;
        }
    }

    @Override
    public void afficher() {
        System.out.println("Il y avait " + nbrBelgique + " lignes contenant implementations.Belgique.");
    }
}
