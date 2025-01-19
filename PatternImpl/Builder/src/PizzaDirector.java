public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void construirePizza() {
        pizzaBuilder.buildTaille();
        pizzaBuilder.buildPate();
        pizzaBuilder.buildFromage();
        pizzaBuilder.buildPepperoni();
        pizzaBuilder.buildChampignons();
    }
}