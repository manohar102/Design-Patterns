package mementopattern;

public class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("Originator: Setting state to \"" + state + "\"");
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: State restored from Memento: \"" + state + "\"");
    }
}
