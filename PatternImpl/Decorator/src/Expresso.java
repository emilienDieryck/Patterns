public class Expresso implements Boisson {
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double cout() {
        return 1.99;  // Prix de base de l'expresso
    }
}