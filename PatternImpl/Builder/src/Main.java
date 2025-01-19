public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        // Construction d'une pizza Margherita
        PizzaBuilder margheritaBuilder = new MargheritaBuilder();
        director.setPizzaBuilder(margheritaBuilder);
        director.construirePizza();
        Pizza margherita = director.getPizza();
        System.out.println("Pizza Margherita: " + margherita);

        // Construction d'une pizza Pepperoni
        PizzaBuilder pepperoniBuilder = new PepperoniBuilder();
        director.setPizzaBuilder(pepperoniBuilder);
        director.construirePizza();
        Pizza pepperoni = director.getPizza();
        System.out.println("Pizza Pepperoni: " + pepperoni);
    }
}