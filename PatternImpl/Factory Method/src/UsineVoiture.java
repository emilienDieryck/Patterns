public class UsineVoiture extends Usine {
    @Override
    public Vehicule creerVehicule() {
        return new Voiture();
    }
}