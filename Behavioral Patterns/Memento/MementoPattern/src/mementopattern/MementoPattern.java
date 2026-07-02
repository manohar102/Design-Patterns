package mementopattern;

public class MementoPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Invoice Draft #1: Created");
        caretaker.add(originator.saveStateToMemento()); // Save #1

        originator.setState("Invoice Draft #2: Added Line Items");
        caretaker.add(originator.saveStateToMemento()); // Save #2

        originator.setState("Invoice Draft #3: Applied 10% Discount");
        // We do NOT save Draft #3 yet

        System.out.println("\n--- Current State ---");
        System.out.println("Current: \"" + originator.getState() + "\"");

        System.out.println("\n--- Restoring to Checkpoint #1 (Draft #2) ---");
        originator.getStateFromMemento(caretaker.get(1));
        
        System.out.println("\n--- Restoring to Checkpoint #0 (Draft #1) ---");
        originator.getStateFromMemento(caretaker.get(0));
    }
}
