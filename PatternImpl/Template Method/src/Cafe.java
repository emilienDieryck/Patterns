public class Cafe extends Boisson {
    @Override
    protected void infuser() {
        System.out.println("Infuser le café.");
    }

    @Override
    protected void ajouterSupplements() {
        System.out.println("Ajouter du lait et du sucre.");
    }
}