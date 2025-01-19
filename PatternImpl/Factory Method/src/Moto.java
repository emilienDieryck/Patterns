public class Moto implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La moto démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La moto s'arrête.");
    }
}