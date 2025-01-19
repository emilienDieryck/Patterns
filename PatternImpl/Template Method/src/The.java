public class The extends Boisson {
    @Override
    protected void infuser() {
        System.out.println("Infuser le thé.");
    }

    @Override
    protected void ajouterSupplements() {
        System.out.println("Ajouter du citron.");
    }
}