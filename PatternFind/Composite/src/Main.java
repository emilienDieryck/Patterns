// Main.java
public class Main {
    public static void main(String[] args) {
        // Création de fichiers
        FileSystemComponent file1 = new File("document.txt", 1024);
        FileSystemComponent file2 = new File("image.png", 2048);
        FileSystemComponent file3 = new File("video.mp4", 1048576);

        // Création de répertoires
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory media = new Directory("Media");

        // Ajout de fichiers aux répertoires
        documents.add(file1);
        media.add(file2);
        media.add(file3);

        // Ajout de répertoires au répertoire racine
        root.add(documents);
        root.add(media);

        // Affichage de l'arborescence
        root.display(0);

        // Calcul de la taille totale
        System.out.println("Total size of root: " + root.getSize() + " bytes");
    }
}