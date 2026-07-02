package strategypattern;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(double amount) {
        // Obfuscate card number for safety
        String maskedCard = "xxxx-xxxx-xxxx-" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Paid $" + String.format("%.2f", amount) + " using Credit Card (" + maskedCard + ")");
    }
}
