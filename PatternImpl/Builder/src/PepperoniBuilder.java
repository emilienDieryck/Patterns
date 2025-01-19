public class PepperoniBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PepperoniBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildTaille() {
        pizza.setTaille("Grande");
    }

    @Override
    public void buildPate() {
        pizza.setPate("Épaisse");
    }

    @Override
    public void buildFromage() {
        pizza.setFromage("Cheddar");
    }

    @Override
    public void buildPepperoni() {
        pizza.setPepperoni("Pepperoni");
    }

    @Override
    public void buildChampignons() {
        // Pas de champignons dans une Pepperoni
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}