public class Library {
    public static void main(String[] args) {
        BookFactory factory = new BookFactory();

        // Création de livres partagés
        Book book1 = factory.getBook("Design Patterns", "Erich Gamma");
        book1.display("Étagère A1");

        Book book2 = factory.getBook("Effective Java", "Joshua Bloch");
        book2.display("Étagère B1");

        // Réutilisation du même livre partagé
        Book book3 = factory.getBook("Design Patterns", "Erich Gamma");
        book3.display("Étagère A2");

        // Création d'un livre non partagé (UnsharedConcreteFlyweight)
        Book unsharedBook = new UnsharedBook("Unique Book");
        unsharedBook.display("Collection spéciale");
    }
}