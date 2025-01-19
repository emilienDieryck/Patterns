public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // Création des observateurs
        NotificationService notificationService = new NotificationService(subject);
        ReportingService reportingService = new ReportingService(subject);

        // Changement d'état du sujet
        subject.setState(10);  // Les observateurs sont notifiés
        subject.setState(20);  // Les observateurs sont notifiés
    }
}