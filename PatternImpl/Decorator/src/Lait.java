public class Lait extends DecorateurBoisson {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Lait";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.50;  // Coût supplémentaire pour le lait
    }
}