public interface PizzaBuilder {
    void buildTaille();
    void buildPate();
    void buildFromage();
    void buildPepperoni();
    void buildChampignons();
    Pizza getPizza();
}