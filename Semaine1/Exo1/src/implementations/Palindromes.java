package implementations;

import interfaces.Observer;

public class Palindromes implements Observer {

    private int nbrPalindromes = 0;
    @Override
    public void update(String line) {
        if (line == null) {
            afficher();
        }
        else {
            for (String mot : line.trim().split(" ")) {
                StringBuffer temp = new StringBuffer(mot);
                if (mot.contentEquals(temp.reverse())) {
                    nbrPalindromes++;
                }
            }
        }
    }

    @Override
    public void afficher() {
        System.out.println("Il y avait " + nbrPalindromes + " palindromes.");
    }
}
