public abstract class Usine {
    public abstract Vehicule creerVehicule();

    public void utiliserVehicule() {
        Vehicule vehicule = creerVehicule();
        vehicule.demarrer();
        vehicule.arreter();
    }
}