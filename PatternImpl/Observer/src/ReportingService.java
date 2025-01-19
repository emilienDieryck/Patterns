public class ReportingService implements Observer {
    private Subject subject;

    public ReportingService(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ReportingService: L'état du sujet a changé. Nouvel état = " + subject.getState());
    }
}