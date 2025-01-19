public class Main {
    public static void main(String[] args) {
        // Préparation d'un thé
        Boisson the = new The();
        System.out.println("Préparation du thé :");
        the.preparer();

        // Préparation d'un café
        Boisson cafe = new Cafe();
        System.out.println("\nPréparation du café :");
        cafe.preparer();
    }
}