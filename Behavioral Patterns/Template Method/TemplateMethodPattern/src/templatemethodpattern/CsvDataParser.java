package templatemethodpattern;

public class CsvDataParser extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data (splitting lines by comma values)...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV transactions (calculating totals and taxes)...");
    }

    @Override
    protected boolean hook() {
        // Csv files require extra audit logging
        return true;
    }
}
