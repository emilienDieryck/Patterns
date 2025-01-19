public class FacadeCommande {
    private GestionStock gestionStock;
    private GestionPaiement gestionPaiement;
    private GestionNotification gestionNotification;

    public FacadeCommande() {
        this.gestionStock = new GestionStock();
        this.gestionPaiement = new GestionPaiement();
        this.gestionNotification = new GestionNotification();
    }

    public void passerCommande(String produit, int quantite, double montant) {
        System.out.println("Début de la commande...");
        gestionStock.verifierStock(produit);
        gestionStock.reduireStock(produit, quantite);
        gestionPaiement.effectuerPaiement(montant);
        gestionNotification.envoyerNotification("Votre commande pour " + produit + " a été passée avec succès.");
        System.out.println("Commande terminée.");
    }
}