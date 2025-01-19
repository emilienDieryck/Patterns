public class Chantilly extends DecorateurBoisson {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chantilly";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.75;  // Coût supplémentaire pour la chantilly
    }
}