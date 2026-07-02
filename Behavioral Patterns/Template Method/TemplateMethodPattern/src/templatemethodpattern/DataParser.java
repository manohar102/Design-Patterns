package templatemethodpattern;

public abstract class DataParser {
    
    // Template Method (final to prevent overriding)
    public final void parseAndProcess(String filepath) {
        readData(filepath);
        parseData();
        processData();
        writeData();
        if (hook()) {
            additionalProcessing();
        }
    }

    // Concrete method implemented in base class
    private void readData(String filepath) {
        System.out.println("Reading data from file: " + filepath);
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void parseData();
    protected abstract void processData();

    // Concrete method with default implementation
    protected void writeData() {
        System.out.println("Writing processed data to database.");
    }

    // Hook method (subclasses can override to customize behavior, but not required)
    protected boolean hook() {
        return false;
    }

    protected void additionalProcessing() {
        System.out.println("Running additional auditing processes.");
    }
}
