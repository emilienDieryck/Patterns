public abstract class DecorateurBoisson implements Boisson {
    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription();
    }

    @Override
    public double cout() {
        return boisson.cout();
    }
}