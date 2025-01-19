public class DocumentImage implements Document {
    private String cheminImage;

    public DocumentImage(String cheminImage) {
        this.cheminImage = cheminImage;
    }

    @Override
    public Document clone() {
        return new DocumentImage(this.cheminImage);
    }

    @Override
    public void afficher() {
        System.out.println("Document Image : " + cheminImage);
    }
}