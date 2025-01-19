public class MacOSFactory implements GUIFactory {
    @Override
    public Button creerBouton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox creerCheckBox() {
        return new MacOSCheckBox();
    }
}