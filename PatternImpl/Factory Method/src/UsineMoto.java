public class UsineMoto extends Usine {
    @Override
    public Vehicule creerVehicule() {
        return new Moto();
    }
}