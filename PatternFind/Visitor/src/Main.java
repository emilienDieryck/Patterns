public class Main {
    public static void main(String[] args) {
        // Création des formes
        Forme cercle = new Cercle(5);
        Forme rectangle = new Rectangle(10, 20);

        // Création des visiteurs
        Visiteur calculAireVisiteur = new CalculAireVisiteur();
        Visiteur afficherDetailsVisiteur = new AfficherDetailsVisiteur();

        // Application des visiteurs sur les formes
        System.out.println("Calcul de l'aire :");
        cercle.accepter(calculAireVisiteur);
        rectangle.accepter(calculAireVisiteur);

        System.out.println("\nAffichage des détails :");
        cercle.accepter(afficherDetailsVisiteur);
        rectangle.accepter(afficherDetailsVisiteur);
    }
}