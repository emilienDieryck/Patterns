public class DocumentTexte implements Document {
    private String contenu;

    public DocumentTexte(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public Document clone() {
        return new DocumentTexte(this.contenu);
    }

    @Override
    public void afficher() {
        System.out.println("Document Texte : " + contenu);
    }
}