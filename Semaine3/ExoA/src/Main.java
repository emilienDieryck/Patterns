public class Main {
    public static void main(String[] args) {
        Magasin dvd = new MagasinDeDVD();
        dvd.ajouterProduit("DVD1", 2000);
        dvd.ajouterProduit("DVD2", 2001);
        Magasin livre = new MagasinDeLivre();
        livre.ajouterProduit("Livre1", 2002);
        livre.ajouterProduit("Livre2", 2003);

    }
}
