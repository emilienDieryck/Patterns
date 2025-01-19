public class Main {
    public static void main(String[] args) {
        // Création d'un document texte original
        Document documentTexteOriginal = new DocumentTexte("Ceci est un document texte.");
        documentTexteOriginal.afficher();

        // Clonage du document texte
        Document documentTexteClone = documentTexteOriginal.clone();
        documentTexteClone.afficher();

        // Création d'un document image original
        Document documentImageOriginal = new DocumentImage("/chemin/vers/image.png");
        documentImageOriginal.afficher();

        // Clonage du document image
        Document documentImageClone = documentImageOriginal.clone();
        documentImageClone.afficher();
    }
}