public interface State {
    void insertQuarter();  // Insérer une pièce
    void ejectQuarter();   // Éjecter la pièce
    void turnCrank();      // Tourner la manivelle
    void dispense();       // Distribuer un bonbon
}