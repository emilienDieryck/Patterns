public class ConcreteBook implements Book {
    private String title;  // Propriété intrinsèque
    private String author; // Propriété intrinsèque

    public ConcreteBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void display(String location) {
        System.out.println("Livre : Titre = " + title + ", Auteur = " + author + ", Emplacement = " + location);
    }
}