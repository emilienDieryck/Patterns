public class UnsharedBook implements Book {
    private String uniqueState;  // Propriété unique (non partagée)

    public UnsharedBook(String uniqueState) {
        this.uniqueState = uniqueState;
    }

    @Override
    public void display(String location) {
        System.out.println("UnsharedBook: Unique State = " + uniqueState + ", Location = " + location);
    }
}