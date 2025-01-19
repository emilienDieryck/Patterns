package interfaces;

/**
 * Observer interface
 */
public interface Observer {

    /**
     * Update the observer with a new line
     * @param line the new line
     */
    void update(String line);

    /**
     * Display the observer's stats
     */
    void afficher();
}
