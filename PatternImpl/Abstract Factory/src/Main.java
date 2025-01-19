public class Main {
    public static void main(String[] args) {
        // Création d'une interface utilisateur pour Windows
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.afficherUI();

        // Création d'une interface utilisateur pour macOS
        GUIFactory macFactory = new MacOSFactory();
        Application macApp = new Application(macFactory);
        macApp.afficherUI();
    }
}