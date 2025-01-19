public class Sucre extends DecorateurBoisson {
    public Sucre(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Sucre";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.20;  // Coût supplémentaire pour le sucre
    }
}