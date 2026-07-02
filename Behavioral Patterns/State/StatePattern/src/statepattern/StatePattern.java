package statepattern;

public class StatePattern {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);

        System.out.println("--- 1st Gumball Cycle ---");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        System.out.println("--- 2nd Gumball Cycle ---");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        System.out.println("--- Attempting when Empty ---");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
