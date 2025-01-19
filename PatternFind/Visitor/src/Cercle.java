public class Cercle implements Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public void accepter(Visiteur visiteur) {
        visiteur.visiter(this);
    }
}