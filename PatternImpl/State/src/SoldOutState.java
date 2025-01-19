public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Vous ne pouvez pas insérer de pièce, la machine est vide.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Vous ne pouvez pas éjecter, vous n'avez pas inséré de pièce.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Vous avez tourné, mais il n'y a plus de bonbons.");
    }

    @Override
    public void dispense() {
        System.out.println("Aucun bonbon distribué.");
    }
}