public class AdaptateurXMLVersJSON implements TraitementJSON {
    private LecteurXML lecteurXML;

    public AdaptateurXMLVersJSON(LecteurXML lecteurXML) {
        this.lecteurXML = lecteurXML;
    }

    @Override
    public void traiterFichierJSON(String cheminFichier) {
        // Lecture du fichier XML
        String contenuXML = lecteurXML.lireFichierXML(cheminFichier);

        // Conversion du XML en JSON (simplifié pour l'exemple)
        String contenuJSON = convertirXMLEnJSON(contenuXML);

        // Traitement du fichier JSON
        System.out.println("Traitement du fichier JSON : " + contenuJSON);
    }

    private String convertirXMLEnJSON(String contenuXML) {
        // Logique de conversion simplifiée
        return "{\"nom\": \"John\", \"age\": 30}";
    }
}