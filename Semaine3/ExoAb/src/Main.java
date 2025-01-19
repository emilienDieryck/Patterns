public class Main {
    public static void main(String[] args) {
        Magasin dvd = new Magasin(new FactoryDeDVD());
        dvd.ajouter("DVD1", 2000);
        dvd.ajouter("DVD2", 2001);
        Magasin livre = new Magasin(new FactoryDeLivre());
        livre.ajouter("Livre1", 2002);
        livre.ajouter("Livre2", 2003);
    }
}
