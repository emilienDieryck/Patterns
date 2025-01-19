public class WindowsFactory implements GUIFactory {
    @Override
    public Button creerBouton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox creerCheckBox() {
        return new WindowsCheckBox();
    }
}