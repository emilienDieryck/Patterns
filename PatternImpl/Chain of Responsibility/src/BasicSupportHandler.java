public class BasicSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("basic")) {
            System.out.println("BasicSupportHandler: Traitement de la demande de support de base.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}