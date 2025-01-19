public class Main {
    public static void main(String[] args) {
        // Création des handlers
        SupportHandler basicHandler = new BasicSupportHandler();
        SupportHandler intermediateHandler = new IntermediateSupportHandler();
        SupportHandler advancedHandler = new AdvancedSupportHandler();

        // Configuration de la chaîne de responsabilité
        basicHandler.setNextHandler(intermediateHandler);
        intermediateHandler.setNextHandler(advancedHandler);

        // Traitement des demandes
        System.out.println("Envoi d'une demande de support de base...");
        basicHandler.handleRequest("basic");

        System.out.println("\nEnvoi d'une demande de support intermédiaire...");
        basicHandler.handleRequest("intermediate");

        System.out.println("\nEnvoi d'une demande de support avancé...");
        basicHandler.handleRequest("advanced");

        System.out.println("\nEnvoi d'une demande inconnue...");
        basicHandler.handleRequest("unknown");
    }
}