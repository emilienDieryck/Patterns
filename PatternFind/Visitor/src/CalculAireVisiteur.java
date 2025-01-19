public class CalculAireVisiteur implements Visiteur {
    @Override
    public void visiter(Cercle cercle) {
        double aire = Math.PI * cercle.getRayon() * cercle.getRayon();
        System.out.println("Aire du cercle : " + aire);
    }

    @Override
    public void visiter(Rectangle rectangle) {
        double aire = rectangle.getLargeur() * rectangle.getHauteur();
        System.out.println("Aire du rectangle : " + aire);
    }
}