public class Main {
    public static void main(String[] args) {
        // Création d'une usine de voitures
        Usine usineVoiture = new UsineVoiture();
        usineVoiture.utiliserVehicule();  // Utilise une voiture

        // Création d'une usine de motos
        Usine usineMoto = new UsineMoto();
        usineMoto.utiliserVehicule();  // Utilise une moto
    }
}