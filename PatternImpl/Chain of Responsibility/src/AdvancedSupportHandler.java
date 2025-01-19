public class AdvancedSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("advanced")) {
            System.out.println("AdvancedSupportHandler: Traitement de la demande de support avancé.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}