public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Vous avez inséré une pièce.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Vous n'avez pas inséré de pièce.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Vous avez tourné, mais il n'y a pas de pièce.");
    }

    @Override
    public void dispense() {
        System.out.println("Vous devez payer d'abord.");
    }
}