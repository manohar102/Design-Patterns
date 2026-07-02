package templatemethodpattern;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        System.out.println("--- Processing CSV Transaction Ledger ---");
        DataParser csvParser = new CsvDataParser();
        csvParser.parseAndProcess("ledger_2026.csv");

        System.out.println("\n--- Processing JSON Billing Events ---");
        DataParser jsonParser = new JsonDataParser();
        jsonParser.parseAndProcess("events_2026.json");
    }
}
