public class MargheritaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildTaille() {
        pizza.setTaille("Moyenne");
    }

    @Override
    public void buildPate() {
        pizza.setPate("Fine");
    }

    @Override
    public void buildFromage() {
        pizza.setFromage("Mozzarella");
    }

    @Override
    public void buildPepperoni() {
        // Pas de pepperoni dans une Margherita
    }

    @Override
    public void buildChampignons() {
        // Pas de champignons dans une Margherita
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}