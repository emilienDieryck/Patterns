public class Main {
    public static void main(String[] args) {
        CollectionLivres collection = new CollectionLivres();
        collection.ajouterLivre("Design Patterns");
        collection.ajouterLivre("Effective Java");
        collection.ajouterLivre("Clean Code");

        Iterateur<String> iterateur = collection.creerIterateur();
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
    }
}