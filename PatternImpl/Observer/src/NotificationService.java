public class NotificationService implements Observer {
    private Subject subject;

    public NotificationService(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("NotificationService: L'état du sujet a changé. Nouvel état = " + subject.getState());
    }
}