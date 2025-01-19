public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Veuillez patienter, nous vous donnons déjà un bonbon.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Désolé, vous avez déjà tourné la manivelle.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Tourner deux fois ne vous donne pas un autre bonbon !");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, plus de bonbons !");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}