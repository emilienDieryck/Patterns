public class AfficherDetailsVisiteur implements Visiteur {
    @Override
    public void visiter(Cercle cercle) {
        System.out.println("Cercle avec rayon : " + cercle.getRayon());
    }

    @Override
    public void visiter(Rectangle rectangle) {
        System.out.println("Rectangle avec largeur : " + rectangle.getLargeur() + " et hauteur : " + rectangle.getHauteur());
    }
}