package templatemethodpattern;

public class JsonDataParser extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data (mapping tokens to transaction structures)...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing JSON transactions (calculating subscription renewals)...");
    }

    @Override
    protected void writeData() {
        System.out.println("Writing processed JSON transactions to external analytics server.");
    }
}
