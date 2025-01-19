public class Main {
    public static void main(String[] args) {
        // Création d'une boisson de base (expresso)
        Boisson boisson = new Expresso();
        System.out.println(boisson.getDescription() + " : " + boisson.cout() + " €");

        // Ajout de suppléments
        boisson = new Lait(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout() + " €");

        boisson = new Sucre(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout() + " €");

        boisson = new Chantilly(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout() + " €");
    }
}