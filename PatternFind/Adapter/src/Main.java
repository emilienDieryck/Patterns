public class Main {
    public static void main(String[] args) {
        // Création de l'ancien système
        LecteurXML lecteurXML = new LecteurXML();

        // Création de l'adaptateur
        TraitementJSON adaptateur = new AdaptateurXMLVersJSON(lecteurXML);

        // Traitement d'un fichier XML avec le nouveau système via l'adaptateur
        adaptateur.traiterFichierJSON("chemin/vers/fichier.xml");
    }
}