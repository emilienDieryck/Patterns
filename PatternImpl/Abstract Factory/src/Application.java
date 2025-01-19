public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.creerBouton();
        checkBox = factory.creerCheckBox();
    }

    public void afficherUI() {
        button.afficher();
        checkBox.afficher();
    }
}