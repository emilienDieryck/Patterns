public class IntermediateSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("intermediate")) {
            System.out.println("IntermediateSupportHandler: Traitement de la demande de support intermédiaire.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}