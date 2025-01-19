public class GestionStock {
    public void verifierStock(String produit) {
        System.out.println("Vérification du stock pour le produit : " + produit);
    }

    public void reduireStock(String produit, int quantite) {
        System.out.println("Réduction du stock pour le produit : " + produit + " de " + quantite + " unités.");
    }
}