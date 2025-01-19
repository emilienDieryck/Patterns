public class Client {
    public static void main(String[] args) {
        // Création de l'objet qui exécute l'action (la lumière)
        Lumiere lumiere = new Lumiere();

        // Création des commandes
        Commande allumerLumiere = new CommandeAllumerLumiere(lumiere);
        Commande eteindreLumiere = new CommandeEteindreLumiere(lumiere);

        // Création de la télécommande
        Telecommande telecommande = new Telecommande();

        // Exécution des commandes
        telecommande.setCommande(allumerLumiere);
        telecommande.appuyerBouton();  // Allume la lumière

        telecommande.setCommande(eteindreLumiere);
        telecommande.appuyerBouton();  // Éteint la lumière
    }
}