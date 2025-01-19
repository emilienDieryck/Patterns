public abstract class Boisson {
    // Méthode template (structure de l'algorithme)
    public final void preparer() {
        faireBouillirEau();
        infuser();
        verserDansTasse();
        ajouterSupplements();
    }

    // Méthode concrète (étape commune)
    private void faireBouillirEau() {
        System.out.println("Faire bouillir l'eau.");
    }

    // Méthode abstraite (étape spécifique à chaque boisson)
    protected abstract void infuser();

    // Méthode concrète (étape commune)
    private void verserDansTasse() {
        System.out.println("Verser dans la tasse.");
    }

    // Méthode hook (étape optionnelle)
    protected void ajouterSupplements() {
        // Par défaut, ne rien faire
    }
}